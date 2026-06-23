// Last updated: 23/06/2026, 10:09:42
1class Solution {
2    public int integerBreak(int n) {
3        int[] dp=new int[n+1];
4        dp[2]=1;
5        for(int i=3;i<=n;i++){
6            for(int j=1;j<i;j++){
7                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
8            }
9        }
10        return dp[n];
11    }
12}