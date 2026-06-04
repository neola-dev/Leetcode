// Last updated: 04/06/2026, 11:16:55
class Solution {
    // public int recur(int i,int j,int[] arr,int[][] dp){
    //     if(i>j) return 0;
    //     int max=Integer.MIN_VALUE;
    //     if(dp[i][j]!=-1)    return dp[i][j];
    //     for(int ind=i;ind<=j;ind++){
    //         int cost=arr[i-1]*arr[ind]*arr[j+1]+recur(i,ind-1,arr,dp)+recur(ind+1,j,arr,dp);
    //         max=Math.max(max,cost);
    //     }
    //     return dp[i][j]=max;
    // }
    public int maxCoins(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        lis.add(1);
        for(int i=0;i<nums.length;i++)  lis.add(nums[i]);
        lis.add(1);
        int[] arr=new int[lis.size()];
        for(int i=0;i<lis.size();i++){
            arr[i]=lis.get(i);
        }
        int n1=nums.length;
        int[][] dp=new int[n1+2][n1+2];
        for(int i=n1;i>=1;i--){
            for(int j=1;j<=n1;j++){
                if(i>j) continue;
                int max=Integer.MIN_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=arr[i-1]*arr[ind]*arr[j+1]+dp[i][ind-1]+dp[ind+1][j];
                    max=Math.max(max,cost);
                }
                dp[i][j]=max;
            }
        }
        return dp[1][n1];
    }
}
