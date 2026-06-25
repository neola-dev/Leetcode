// Last updated: 25/06/2026, 09:57:34
1class Solution {
2    public double myPow(double x, int n) {
3        double ans=1.0; 
4        long nn=n;
5        if(n<0) nn=-1*nn; 
6        while(nn>0){
7            if(nn%2==1){
8                ans=ans*x;
9                nn=nn-1;
10            }
11            else{
12                x=x*x;
13                nn=nn/2;
14            }
15        }
16        if(n<0) ans=(double)1.0/(double)ans;
17        return ans;
18    }
19}