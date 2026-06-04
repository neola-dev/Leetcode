// Last updated: 04/06/2026, 11:18:56
class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            char chL=s.charAt(l);
            char chR=s.charAt(r);
            if(!Character.isLetterOrDigit(chL) || Character.isWhitespace(chL))    l++;
            else if(!Character.isLetterOrDigit(chR) || Character.isWhitespace(chR)) r--;
            else if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
            else{
                l++;
                r--;
            }    
        }
        return true;
    }
}