// Last updated: 14/06/2026, 08:02:53
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int digSum=0;
4        int sqSum=0;
5        int temp=n;
6        while(temp>0){
7            digSum+=temp%10;
8            sqSum+=(temp%10)*(temp%10);
9            temp/=10;
10        }
11        return sqSum-digSum>=50;
12    }
13}