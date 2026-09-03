// Last updated: 03/09/2026, 11:53:54
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int n=s1.length();
4        int m=s2.length();
5        int[][] dp=new int[n+1][m+1];
6        for(int i=1;i<=n;i++){
7            dp[i][0]=dp[i-1][0]+s1.charAt(i-1);
8        }
9        for(int j=1;j<=m;j++){
10            dp[0][j]=dp[0][j-1]+s2.charAt(j-1);
11        }
12        for(int i=1;i<=n;i++){
13            for(int j=1;j<=m;j++){
14                if(s1.charAt(i-1)==s2.charAt(j-1)){
15                    dp[i][j]=dp[i-1][j-1];
16                }
17                else{
18                    dp[i][j]=Math.min(dp[i-1][j]+s1.charAt(i-1),dp[i][j-1]+s2.charAt(j-1));
19                }
20            }
21        }
22        return dp[n][m];
23    }
24}