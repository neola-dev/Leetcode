// Last updated: 04/06/2026, 11:15:51
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n*2-1;i>=0;i--){
            if(i<n){
                while(!st.isEmpty() && nums[st.peek()%n]<=nums[i]){
                    st.pop();
                }
                nge[i]=st.isEmpty()?-1:nums[st.peek()%n];
            }
            st.push(i);
        }
        return nge;
    }
}