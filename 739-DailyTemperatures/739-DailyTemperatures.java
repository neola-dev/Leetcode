// Last updated: 04/06/2026, 11:14:46
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            nge[i]=st.isEmpty()?0:st.peek()-i;
            st.add(i);
        }
        return nge;
    }
}