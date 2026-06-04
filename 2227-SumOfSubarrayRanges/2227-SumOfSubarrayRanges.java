// Last updated: 04/06/2026, 11:11:39
class Solution {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;

        int[] pge = new int[n];
        int[] nge = new int[n];
        int[] pse = new int[n];
        int[] nse = new int[n];

        Stack<Integer> st = new Stack<>();

        // PGE (strictly greater)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) st.pop();
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // NGE (greater or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) st.pop();
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();

        // PSE (strictly smaller)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // NSE (smaller or equal)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long maxSum = 0, minSum = 0;

        for (int i = 0; i < n; i++) {
            maxSum += (long) nums[i] * (i - pge[i]) * (nge[i] - i);
            minSum += (long) nums[i] * (i - pse[i]) * (nse[i] - i);
        }

        return maxSum - minSum;
    }
}
