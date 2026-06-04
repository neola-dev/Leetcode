// Last updated: 04/06/2026, 11:11:38
class Solution {
    public boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            boolean palindrome=isPalindrome(words[i]);
            if(palindrome){
                return words[i];
            }
        }
        return "";
    }
}