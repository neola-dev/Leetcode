// Last updated: 11/06/2026, 17:15:21
1class Solution {
2    public int[] asteroidCollision(int[] aster) {
3        Stack<Integer> st=new Stack<>();
4        for(int num:aster){
5            if(num>0)   st.push(num);
6            else{
7                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(num)){
8                    st.pop();
9                }
10                if(!st.isEmpty() && st.peek()==Math.abs(num)){
11                    st.pop();
12                }
13                else if(st.isEmpty() || st.peek()<0){
14                    st.push(num);
15                }
16            }
17        }
18        List<Integer> res=new ArrayList<>();
19        while(!st.isEmpty()){
20            res.add(st.pop());
21        }
22        int[] ans=new int[res.size()];
23        for(int i=0;i<res.size();i++){
24            ans[i]=res.get(res.size()-1-i);
25        }
26        return ans;
27    }
28}