// Last updated: 31/08/2026, 09:25:42
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        HashSet<String> set=new HashSet<>(wordDict);
4        int n=s.length();
5        boolean[] dp=new boolean[n+1];
6        dp[0]=true;
7        for(int i=1;i<=n;i++){
8            for(int j=0;j<i;j++){
9                if(dp[j] && set.contains(s.substring(j,i))){
10                    dp[i]=true;
11                    break;
12                }
13            }
14        }
15        return dp[n];
16    }
17}