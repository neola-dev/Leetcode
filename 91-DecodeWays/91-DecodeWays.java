// Last updated: 12/07/2026, 11:02:35
1class Solution {
2    public int findWays(int ind,String s,int[] dp){
3        if(ind==s.length()){
4            return 1;
5        }
6        if(s.charAt(ind)=='0'){
7            return 0;
8        }
9        if(dp[ind]!=-1) return dp[ind];
10        int ways=findWays(ind+1,s,dp);
11        if(ind+1<s.length()){
12            int num=(s.charAt(ind)-'0')*10+(s.charAt(ind+1)-'0');
13            if(num>=10 && num<=26){
14                ways+=findWays(ind+2,s,dp);
15            }
16        }
17        return dp[ind]=ways;
18    }
19    public int numDecodings(String s) {
20        int[] dp=new int[s.length()];
21        Arrays.fill(dp,-1);
22        return findWays(0,s,dp);
23    }
24}