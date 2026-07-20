// Last updated: 20/07/2026, 14:23:50
1class Solution {
2    public boolean recur(int i,int j,String s,String p,int[][] dp){
3        if(i<0 && j<0) return true;
4        if(i>=0 && j<0) return false;
5        if(i<0 && j>=0){
6            for(int k=0;k<=j;k++){
7                if(p.charAt(k)!='*') return false;
8            }
9            return true;
10        }
11        if(dp[i][j]!=-1) return dp[i][j]==1;
12        boolean ans=false;
13        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
14            ans=recur(i-1,j-1,s,p,dp);
15        }
16        else if(p.charAt(j)=='*'){
17            ans=recur(i-1,j,s,p,dp) || recur(i,j-1,s,p,dp);
18        }
19        dp[i][j]=ans?1:0;
20        return ans;
21    }
22    public boolean isMatch(String s, String p) {
23        int n=s.length();
24        int m=p.length();
25        int[][] dp=new int[n+1][m+1];
26        for(int i=0;i<=n;i++){
27            Arrays.fill(dp[i],-1);
28        }
29        return recur(n-1,m-1,s,p,dp);
30    }
31}