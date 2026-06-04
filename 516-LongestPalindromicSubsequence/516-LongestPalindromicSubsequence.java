// Last updated: 04/06/2026, 11:15:46
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        //in lcs way...where s1 is s and s2 is rev of s
        //if we find lcs of both s1 and s2..then it will be palindrom for sure
        //becoz s2 is rev of s
        String s1=s;
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][n];
    }
}