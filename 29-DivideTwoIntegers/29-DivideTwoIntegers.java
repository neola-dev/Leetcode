// Last updated: 04/06/2026, 11:20:41
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==divisor)   return 1;
        if(dividend==Integer.MIN_VALUE && divisor==-1)  return Integer.MAX_VALUE;
        boolean sign=true;
        if(dividend>=0 && divisor<0)    sign=false;
        if(dividend<0 && divisor>=0)    sign=false;
        if(divisor==1)  return dividend;
        long n=dividend;
        long d=divisor;
        n=Math.abs(n);
        d=Math.abs(d);
        long ans=0;
        while(n>=d){
            int cnt=0;
            while(n>=d<<(cnt+1)){
                cnt++;
            }
            ans+=1<<cnt;
            n=n-(d*(1<<cnt));
        }
        if(ans>Integer.MAX_VALUE && sign==false)    return Integer.MIN_VALUE;
        if(ans>Integer.MAX_VALUE && sign==true)     return Integer.MAX_VALUE;
        return sign?(int)ans:(int)ans*-1;
    }
}