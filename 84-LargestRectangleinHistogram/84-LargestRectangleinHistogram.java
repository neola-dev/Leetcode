// Last updated: 12/06/2026, 22:46:24
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        Stack<Integer> st=new Stack<>();
4        int[] pse=new int[heights.length];
5        for(int i=0;i<heights.length;i++){
6            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
7                st.pop();
8            }
9            pse[i]=st.isEmpty()?-1:st.peek();
10            st.push(i);
11        }
12        st.clear();
13        int[] nse=new int[heights.length];
14        for(int i=heights.length-1;i>=0;i--){
15            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
16                st.pop();
17            }
18            nse[i]=st.isEmpty()?heights.length:st.peek();
19            st.push(i);
20        }
21        int maxArea=0;
22        for(int i=0;i<heights.length;i++){
23            int area=heights[i]*(nse[i]-pse[i]-1);
24            maxArea=Math.max(maxArea,area);
25        }
26        return maxArea;
27    }
28}