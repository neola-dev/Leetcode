// Last updated: 04/06/2026, 11:14:47
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i]>0)  st.push(asteroids[i]);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()<0){
                    st.push(asteroids[i]);
                }
            }    
        }
        List<Integer> lis=new ArrayList<>();
        while(!st.isEmpty()){
            lis.add(st.pop());
        }
        int m=lis.size();
        int[] res=new int[m];
        for(int i=0;i<res.length;i++){
            res[i]=lis.get(m-i-1);
        }
        return res;
    }
}