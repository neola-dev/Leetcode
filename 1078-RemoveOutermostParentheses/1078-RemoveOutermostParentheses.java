// Last updated: 04/06/2026, 11:13:30
class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                cnt--;
            }    
            if(cnt!=0)  ans+=ch; 
            if(ch=='('){
                cnt++;
            }
        }
        return ans;
    }
}