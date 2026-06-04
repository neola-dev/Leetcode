// Last updated: 04/06/2026, 11:18:10
class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int b=0;b<2;b++){
                for(int c=1;c<=k;c++){
                    int profit;
                    if(b==1){
                        profit=Math.max(-prices[i]+dp[i+1][0][c],0+dp[i+1][1][c]);
                    }
                    else{
                        profit=Math.max(prices[i]+dp[i+1][1][c-1],0+dp[i+1][0][c]);
                    }
                    dp[i][b][c]=profit;
                }
            }
        }
        return dp[0][1][k];
    }
}