// Last updated: 20/07/2026, 09:40:31
1class Solution {
2    public int minInsertions(String s) {
3        int n=s.length();
4        StringBuilder sb=new StringBuilder(s);
5        String s2=sb.reverse().toString();
6        int[][] dp=new int[n+1][n+1];
7        int lcs=0;
8        for(int i=1;i<=n;i++){
9            for(int j=1;j<=n;j++){
10                if(s.charAt(i-1)==s2.charAt(j-1)){
11                    dp[i][j]=1+dp[i-1][j-1];
12                    lcs=Math.max(lcs,dp[i][j]);
13                }
14                else{
15                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
16                }
17            }
18        }
19        return n-lcs;
20    }
21}