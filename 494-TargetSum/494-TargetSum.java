// Last updated: 04/06/2026, 11:15:58
class Solution {
    public int findTargetSumWays(int[] arr, int diff) {
        int n=arr.length;
        int tot=0;
        for(int num:arr)   tot+=num;
        int target=(tot-diff)/2;
        if (tot - diff < 0 || (tot - diff) % 2 != 0) return 0;
        int[][] dp=new int[n][target+1];
        if(arr[0]==0)   dp[0][0]=2;
        else dp[0][0]=1;
        
        if(arr[0]!=0 && arr[0]<=target) dp[0][arr[0]]=1;
        
        for(int i=1;i<n;i++){
            for(int t=0;t<=target;t++){
                int  notTake=dp[i-1][t];
                int take=0;
                if(arr[i]<=t)  take=dp[i-1][t-arr[i]];
                dp[i][t]=take+notTake;
            }
        }
        return dp[n-1][target];
    }
}