// Last updated: 10/06/2026, 12:35:34
1class Solution {
2    public int evalRPN(String[] tokens) {
3        int ans=0;
4        Stack<Integer> st=new Stack<>();
5        for(String str:tokens){
6            if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
7                int first=st.pop();
8                int second=st.pop();
9                if(str.equals("+")){
10                    st.push((second+first));
11                }
12                else if(str.equals("-")){
13                    st.push((second-first));
14                }
15                else if(str.equals("/")){
16                    st.push((second/first));
17                }
18                else if(str.equals("*")){
19                    st.push((second*first));
20                }
21            }
22            else{
23                st.push(Integer.parseInt(str));
24            }
25        }
26        return st.pop();
27    }
28}