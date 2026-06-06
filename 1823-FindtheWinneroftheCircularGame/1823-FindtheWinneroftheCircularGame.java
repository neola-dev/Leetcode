// Last updated: 06/06/2026, 08:45:51
1class Solution {
2    public int findTheWinner(int n, int k) {
3        int ans=0;
4        for(int i=1;i<=n;i++){
5            ans=(ans+k)%i;
6        }
7        return ans+1;
8    }
9}