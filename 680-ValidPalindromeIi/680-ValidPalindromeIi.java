// Last updated: 04/06/2026, 11:14:59
class Solution {
    public boolean isPalindrome(String str,int left,int right){

        while(left<right){
            char chLeft=str.charAt(left);
            char chRight=str.charAt(right);
            if(chLeft!=chRight){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
}