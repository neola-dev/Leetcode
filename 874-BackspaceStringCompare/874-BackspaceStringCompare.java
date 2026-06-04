// Last updated: 04/06/2026, 11:14:17
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!st1.empty()) st1.pop();
            }
            else{
                st1.push(s.charAt(i));
            }
        }
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!st2.empty()) st2.pop();
            }
            else{
                st2.push(t.charAt(i));
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        while(!st1.empty()){
            sb1.append(st1.pop());
        }
        while(!st2.empty()){
            sb2.append(st2.pop());
        }
        return sb1.reverse().toString().equals(sb2.reverse().toString());
    }
}