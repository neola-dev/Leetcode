// Last updated: 10/08/2026, 21:32:45
1class Solution {
2    public int numDecodings(String s) {
3        int n=s.length();
4        int[] dp=new int[n];
5        Arrays.fill(dp,-1);
6        return find(0,s,n,dp);
7    }
8    public int find(int ind,String s,int n,int[] dp){
9        if(ind==n) return 1;
10        if(s.charAt(ind)=='0') return 0;
11        if(dp[ind]!=-1) return dp[ind];
12        int ways=0;
13        ways+=find(ind+1,s,n,dp);
14        if(ind+1<n){
15            int num=(s.charAt(ind)-'0')*10+(s.charAt(ind+1)-'0');
16            System.out.println(num);
17            if(num>=10 && num<=26){
18                ways+=find(ind+2,s,n,dp);
19            }
20        }
21        return dp[ind]=ways;
22    }
23}