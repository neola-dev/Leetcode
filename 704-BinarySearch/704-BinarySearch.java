// Last updated: 14/06/2026, 16:11:19
1class Solution {
2    public int mySqrt(int x) {
3        long l=1;
4        long h=x;
5        while(l<=h){
6            long m=l+(h-l)/2;
7            long sq=m*m;
8            if((int)sq==x){
9                return (int)m;
10            }
11            else if(sq<x){
12                l=m+1;
13            }
14            else{
15                h=m-1;
16            }
17        }
18        return (int)h;
19    }
20}