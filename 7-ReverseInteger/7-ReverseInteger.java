// Last updated: 04/06/2026, 11:21:09
class Solution {
    public int reverse(int x) {
        long ans=0;
        int temp=x;
        if(x<0) temp=x*-1;
        while(temp>0){
            ans=ans*10+temp%10;
            temp=temp/10;
        }
        if(ans<=Integer.MIN_VALUE || ans>=Integer.MAX_VALUE)  return 0;
        return x<0?(int)ans*-1:(int)ans;
    }
}