// Last updated: 20/07/2026, 00:21:32
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n = text1.length();
4        int m = text2.length();
5        int[][] dp = new int[n + 1][m + 1];
6        for (int i = 1; i <= n; i++) {
7            for (int j = 1; j <= m; j++) {
8                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
9                    dp[i][j] = 1 + dp[i - 1][j - 1];
10                } else {
11                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
12                }
13            }
14        }
15        //to print lcs
16        int i=n;
17        int j=m;
18        StringBuilder sb=new StringBuilder();
19        while(i>0 && j>0){
20            if(text1.charAt(i-1)==text2.charAt(j-1)){
21                sb.append(text1.charAt(i-1));
22                i=i-1;
23                j=j-1;
24            }
25            else if(dp[i-1][j]>dp[i][j-1]){
26                i=i-1;
27            }
28            else{
29                j=j-1;
30            }
31        }
32        System.out.print(sb.reverse().toString());
33        return dp[n][m];
34    }
35}