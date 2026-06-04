// Last updated: 04/06/2026, 11:21:11
class Solution {
    public String expandAroundCenter(String s,int i,int j){
        int length=s.length();
        while(i>=0 && j<length){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }
        return s.substring(i+1,j);
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String longest="";
        for(int i=0;i<n;i++){
            String odd=expandAroundCenter(s,i,i);
            if(odd.length()>longest.length())   longest=odd;
            String even=expandAroundCenter(s,i,i+1);
            if(even.length()>longest.length())  longest=even;
        }
        return longest;
    }
}