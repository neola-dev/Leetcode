// Last updated: 04/06/2026, 11:18:59
class Solution {
    public int recur(int i,int buy,int cap,int[] prices,int n,int[][][] dp){
        if(i==n)    return 0;
        if(cap==0)  return 0;
        if(dp[i][buy][cap]!=-1)  return dp[i][buy][cap];
        int profit;
        if(buy==1){
            profit=Math.max(-prices[i]+recur(i+1,0,cap,prices,n,dp),0+recur(i+1,1,cap,prices,n,dp));
        }
        else{
            profit=Math.max(prices[i]+recur(i+1,1,cap-1,prices,n,dp),0+recur(i+1,0,cap,prices,n,dp));
        }
        return dp[i][buy][cap]=profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][3];
        //if(cap==0)
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dp[i][j][0]=0;
            }
        }
        //if(i==n)
        for(int buy=0;buy<2;buy++){
            for(int c=0;c<3;c++){
                dp[n][buy][c]=0;
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int b=0;b<2;b++){
                for(int c=1;c<=2;c++){
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
        return dp[0][1][2];
    }
}