// Last updated: 29/07/2026, 22:58:15
1class Solution {
2    public int[] dailyTemperatures(int[] temp) {
3        int n=temp.length;
4        int[] nge=new int[n];
5        Stack<Integer> st=new Stack<>();
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
8                st.pop();
9            }
10            nge[i]=st.isEmpty()?0:st.peek()-i;
11            st.push(i);
12        }
13        return nge;
14    }
15}