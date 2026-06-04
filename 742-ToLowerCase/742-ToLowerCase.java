// Last updated: 04/06/2026, 11:14:44
class Solution {
    public String toLowerCase(String s) {
        int n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            int charcode=(int) s.charAt(i);
            if(charcode>=65 && charcode<=90){
                int newcharcode=charcode+32;
                char newchar=(char) newcharcode;
                res+=newchar;
            }
            else res+=s.charAt(i);
        }
        return res;
    }
}