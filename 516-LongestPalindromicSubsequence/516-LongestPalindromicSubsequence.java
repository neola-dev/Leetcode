// Last updated: 20/07/2026, 09:29:21
1class Solution {
2    public int longestPalindromeSubseq(String s) {
3        StringBuilder sb=new StringBuilder(s);
4        String s2=sb.reverse().toString();
5        int n=s.length();
6        int[][] dp=new int[n+1][n+1];
7        for(int i=1;i<=n;i++){
8            for(int j=1;j<=n;j++){
9                if(s.charAt(i-1)==s2.charAt(j-1)){
10                    dp[i][j]=1+dp[i-1][j-1];
11                }
12                else{
13                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
14                }
15            }
16        }
17        return dp[n][n];
18    }
19}