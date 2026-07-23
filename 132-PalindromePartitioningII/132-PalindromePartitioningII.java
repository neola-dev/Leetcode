// Last updated: 23/07/2026, 10:10:47
1class Solution {
2    public boolean isPalind(int st,int end,String s){
3        while(st<end){
4            if(s.charAt(st)!=s.charAt(end)) return false;
5            st++;
6            end--;
7        }
8        return true;
9    }
10    public int minCut(String s) {
11        int n=s.length();
12        int[] dp=new int[n+1];
13        for(int i=n-1;i>=0;i--){
14            int min=Integer.MAX_VALUE;
15            for(int ind=i;ind<s.length();ind++){
16                if(isPalind(i,ind,s)){
17                    int cuts=1+dp[ind+1];
18                    min=Math.min(min,cuts);
19                }
20            }
21            dp[i]=min;
22        }
23        return dp[0]-1;
24    }
25}