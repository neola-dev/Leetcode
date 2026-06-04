// Last updated: 04/06/2026, 11:12:49
class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        //lcs-- we will keep the palindromic subseq intact
        //total length of string - constant part is the min insertion needed
        int max=0;
        String s1=s;
        StringBuilder sb=new StringBuilder(s);
        String s2=sb.reverse().toString();
        //in lcs way...where s1 is s and s2 is rev of s
        //if we find lcs of both s1 and s2..then it will be palindrom for sure
        //becoz s2 is rev of s
        int[][] dp=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(max,dp[i][j]);
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int ans=n-max;
        return ans;
    }
}