// Last updated: 11/06/2026, 13:23:28
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n=nums.length;
4        int[] nge=new int[n];
5        Stack<Integer> st=new Stack<>();
6        for(int i=n*2-1;i>=0;i--){
7            if(i<n){
8                while(!st.isEmpty() && nums[i]>=nums[st.peek()%n]){
9                    st.pop();
10                }
11                nge[i]=st.isEmpty()?-1:nums[st.peek()%n];
12            }
13            st.push(i);
14        }
15        return nge;
16    }
17}