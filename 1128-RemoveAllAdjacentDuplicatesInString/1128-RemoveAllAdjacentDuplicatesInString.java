// Last updated: 04/06/2026, 11:13:24
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty() && st.peek()==s.charAt(i)){
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