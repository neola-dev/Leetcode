// Last updated: 04/06/2026, 11:15:45
class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[] prev=new int[amount+1];
        //base case
        for(int t=0;t<=amount;t++){
            if(t%coins[0]==0) prev[t]=1;
            else prev[t]=0;
        }
        for(int i=1;i<n;i++){
            int[] curr=new int[amount+1];
            for(int t=0;t<=amount;t++){
                int notTake=prev[t];
                int take=0;
                if(coins[i]<=t)  take=curr[t-coins[i]];
                curr[t]=take+notTake;
            }
            prev=curr;
        }
        return prev[amount];
    }
}