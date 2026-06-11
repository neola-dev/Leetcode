// Last updated: 11/06/2026, 11:46:47
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        int n=temp.length;
4        Stack<Integer> st=new Stack<>();
5        int[] ans=new int[n];
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
8                st.pop();
9            }
10            ans[i]=st.isEmpty()?0:st.peek()-i;
11            st.push(i);
12        }
13        return ans;
14    }
15}