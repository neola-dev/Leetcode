// Last updated: 13/06/2026, 12:35:46
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        int n = nums.length;
4        int[] pge = new int[n];
5        int[] nge = new int[n];
6        int[] pse = new int[n];
7        int[] nse = new int[n];
8        Stack<Integer> st = new Stack<>();
9        for (int i = 0; i < n; i++) {
10            while (!st.isEmpty() && nums[st.peek()]<nums[i]) st.pop();
11            pge[i] = st.isEmpty() ? -1 : st.peek();
12            st.push(i);
13        }
14        st.clear();
15        for (int i = n - 1; i >= 0; i--) {
16            while (!st.isEmpty() && nums[st.peek()]<=nums[i]) st.pop();
17            nge[i] = st.isEmpty() ? n : st.peek();
18            st.push(i);
19        }
20        st.clear();
21        for (int i = 0; i < n; i++) {
22            while (!st.isEmpty() && nums[st.peek()]>nums[i]) st.pop();
23            pse[i] = st.isEmpty() ? -1 : st.peek();
24            st.push(i);
25        }
26        st.clear();
27        for (int i = n - 1; i >= 0; i--) {
28            while (!st.isEmpty() && nums[st.peek()]>=nums[i]) st.pop();
29            nse[i] = st.isEmpty() ? n : st.peek();
30            st.push(i);
31        }
32        long maxSum = 0, minSum = 0;
33        for (int i = 0; i < n; i++) {
34            maxSum += (long)nums[i]*(i - pge[i])*(nge[i] - i);
35            minSum += (long)nums[i]*(i - pse[i])*(nse[i] - i);
36        }
37        return maxSum-minSum;
38    }
39}