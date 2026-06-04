// Last updated: 04/06/2026, 11:21:07
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=0;
        int temp=x;
        while(temp>0){
            y=y*10+temp%10;
            temp/=10;
        }
        return y==x;
    }
}