// Last updated: 12/06/2026, 23:04:29
1class Solution {
2    public int findLarge(int[] hei){
3        int n=hei.length;
4        int[] pse=new int[n];
5        int[] nse=new int[n];
6        Stack<Integer> st=new Stack<>();
7        for(int i=0;i<n;i++){
8            while(!st.isEmpty() && hei[i]<=hei[st.peek()]){
9                st.pop();
10            }
11            pse[i]=st.isEmpty()?-1:st.peek();
12            st.push(i);
13        }
14        st.clear();
15        for(int i=n-1;i>=0;i--){
16            while(!st.isEmpty() && hei[i]<=hei[st.peek()]){
17                st.pop();
18            }
19            nse[i]=st.isEmpty()?n:st.peek();
20            st.push(i);
21        }
22        int maxArea=0;
23        for(int i=0;i<n;i++){
24            int area=hei[i]*(nse[i]-pse[i]-1);
25            maxArea=Math.max(maxArea,area);
26        }
27        return maxArea;
28    }
29    public int maximalRectangle(char[][] matrix) {
30        int m=matrix[0].length;
31        int[] heights=new int[m];
32        int maxArea=Integer.MIN_VALUE;
33        for(int i=0;i<matrix.length;i++){
34            for(int j=0;j<matrix[0].length;j++){
35                if(matrix[i][j]=='1'){
36                    heights[j]++;
37                }
38                else{
39                    heights[j]=0;
40                }
41            }
42            int larg=findLarge(heights);
43            maxArea=Math.max(maxArea,larg);
44        }
45        return maxArea;
46    }
47}