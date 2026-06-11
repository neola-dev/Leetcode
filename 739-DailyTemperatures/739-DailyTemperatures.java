// Last updated: 11/06/2026, 17:14:42
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st=new Stack<>();
4        int n=asteroids.length;
5        for(int i=0;i<n;i++){
6            if(asteroids[i]>0)  st.push(asteroids[i]);
7            else{
8                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
9                    st.pop();
10                }
11                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
12                    st.pop();
13                }
14                else if(st.isEmpty() || st.peek()<0){
15                    st.push(asteroids[i]);
16                }
17            }    
18        }
19        List<Integer> lis=new ArrayList<>();
20        while(!st.isEmpty()){
21            lis.add(st.pop());
22        }
23        int m=lis.size();
24        int[] res=new int[m];
25        for(int i=0;i<res.length;i++){
26            res[i]=lis.get(m-i-1);
27        }
28        return res;
29    }
30}