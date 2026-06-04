// Last updated: 04/06/2026, 11:20:24
class Solution {
    // public boolean recur(int i,int j,String s,String p,int[][] dp){
    //     if(i<0 && j<0)  return true;
    //     if(i>=0 && j<0) return false;
    //     if(j>=0 && i<0){
    //         for(int ii=0;ii<=j;ii++){
    //             if(p.charAt(ii)!='*')   return false;
    //         }
    //         return true;
    //     }
    //     if(dp[i][j]!=-1)    return dp[i][j]==1;
    //     boolean ans;
    //     if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
    //         ans=recur(i-1,j-1,s,p,dp);
    //     }
    //     else if(p.charAt(j)=='*'){
    //         ans=recur(i-1,j,s,p,dp) || recur(i,j-1,s,p,dp);
    //     }
    //     else{
    //         ans=false;
    //     }    
    //     dp[i][j]=ans==true?1:0;
    //     return ans;
    // }
    public boolean isMatch(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        dp[0][0]=true;
        //string empty with pattern remaining
        for(int j=1;j<=m;j++){
            boolean ans=true;
            for(int k=1;k<=j;k++){
                if(p.charAt(k-1)!='*'){
                    ans=false;
                    break;
                }    
            }
            dp[0][j]=ans;
        }
        //string remaning with pattern empty
        for(int i=1;i<=n;i++){
            dp[i][0]=false;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                boolean ans;
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    ans=dp[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    ans=dp[i-1][j] || dp[i][j-1];
                }
                else{
                    ans=false;
                }    
                dp[i][j]=ans;
            }    
        }
        return dp[n][m];
    }
}