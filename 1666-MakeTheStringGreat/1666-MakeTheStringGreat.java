// Last updated: 04/06/2026, 11:12:22
class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && ((char)(st.peek()+32)==s.charAt(i) || st.peek()==(char)(s.charAt(i)-32))){
                st.pop();
            }
            else if(!st.empty() && ((char)(st.peek()-32)==s.charAt(i) || st.peek()==(char)(s.charAt(i)+32))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}