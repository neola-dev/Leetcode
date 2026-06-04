// Last updated: 04/06/2026, 11:13:13
class Solution {
    public int tribonacci(int n) {
        if(n==0 || n==1)    return n;
        if(n==2)    return 1;
        int a=0;
        int b=1;
        int c=a+b;
        int d=a+b+c;
        for(int i=4;i<=n;i++){
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }
        return d;
    }
}