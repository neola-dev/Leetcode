// Last updated: 04/06/2026, 11:19:49
class Solution {
    public int recur(int i,int j,String word1,String word2,int[][] dp){
        if(i==0) return j;
        if(j==0) return i;
        if(dp[i][j]!=-1)    return dp[i][j];
        if(word1.charAt(i-1)==word2.charAt(j-1)){
            return dp[i][j]=recur(i-1,j-1,word1,word2,dp);
        }
        else{
            //insert
            int insert=1+recur(i,j-1,word1,word2,dp);
            int delete=1+recur(i-1,j,word1,word2,dp);
            int replace=1+recur(i-1,j-1,word1,word2,dp);
            return dp[i][j]=Math.min(Math.min(insert,delete),replace);
        }
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                dp[i][j]=-1;
            }
        }
        return recur(n,m,word1,word2,dp);
    }
}