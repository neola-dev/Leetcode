// Last updated: 11/06/2026, 12:25:59
1class Solution {
2    public int[] finalPrices(int[] nums) {
3        Stack<Integer> st=new Stack<>();
4        int n=nums.length;
5        int[] nse=new int[n];
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty() && nums[i]<nums[st.peek()]){
8                st.pop();
9            }
10            nse[i]=st.isEmpty()?nums[i]:nums[i]-nums[st.peek()];
11            st.push(i);
12        }
13        return nse;
14    }
15}