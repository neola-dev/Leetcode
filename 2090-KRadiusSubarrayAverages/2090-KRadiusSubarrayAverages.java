// Last updated: 03/09/2026, 22:53:09
1class Solution {
2    public int equalSubstring(String s, String t, int maxCost) {
3        int l=0;
4        int r=0;
5        int n=s.length();
6        int cost=0;
7        int ans=0;
8        while(r<n){
9            cost+=Math.abs(s.charAt(r)-t.charAt(r));
10            while(cost>maxCost){
11                cost-=Math.abs(s.charAt(l)-t.charAt(l));
12                l++;
13            }
14            ans=Math.max(ans,r-l+1);
15            r++;
16        }
17        return ans;
18    }
19}