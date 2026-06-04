// Last updated: 04/06/2026, 11:19:35
class Solution {
    public int largestRectangleArea(int[] heights) {
        //find prev smaller
        Stack<Integer> st=new Stack<>();
        int[] pse=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        st.clear();
        int[] nse=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?heights.length:st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}