// Last updated: 04/06/2026, 11:13:25
class Solution {
    public int recur(int i,int[] arr,int k,int[] dp){
        if(i==arr.length)   return 0;
        if(dp[i]!=-1)   return dp[i];
        int maxAns=Integer.MIN_VALUE;
        int maxi=Integer.MIN_VALUE;
        int len=0;
        for(int j=i;j<Math.min(arr.length,i+k);j++){
            maxi=Math.max(maxi,arr[j]);
            len++;
            int sum=(len*maxi)+recur(j+1,arr,k,dp);
            maxAns=Math.max(maxAns,sum);
        }
        return dp[i]=maxAns;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int maxAns=Integer.MIN_VALUE;
            int maxi=Integer.MIN_VALUE;
            int len=0;
            for(int j=i;j<Math.min(arr.length,i+k);j++){
                maxi=Math.max(maxi,arr[j]);
                len++;
                int sum=(len*maxi)+dp[j+1];
                maxAns=Math.max(maxAns,sum);
            }
            dp[i]=maxAns;
        }
        return dp[0];
    }
}