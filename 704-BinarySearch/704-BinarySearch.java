// Last updated: 14/06/2026, 16:09:41
1class Solution {
2    public int mySqrt(int x) {
3        long low=1;
4        long high=x;
5        long ans=0;
6        while(low<=high){
7            long mid=(low+high)/2;
8            long square=mid*mid;
9            if(square<=x){
10                ans=mid;
11                low=mid+1;
12            }
13            else{
14                high=mid-1;
15            }
16        }
17        return (int)high;
18    }
19}