// Last updated: 13/06/2026, 11:33:15
1class Solution {
2    public int trap(int[] height) {
3        Stack<Integer> st=new Stack<>();
4        int n=height.length;
5        int tot=0;
6        for(int i=0;i<n;i++){
7            while(!st.isEmpty() && height[i]>height[st.peek()]){
8                int mid=height[st.pop()];
9                if(st.isEmpty()) break;
10                int left=height[st.peek()];
11                int hei=Math.min(height[i],left)-mid;
12                int wid=i-(st.peek())-1;
13                tot+=hei*wid;
14            }
15            st.push(i);
16        }
17        return tot;
18    }
19}