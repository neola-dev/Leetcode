// Last updated: 04/06/2026, 11:12:21
class Solution {
    // public int recur(int i,int j,int[] arr,int[][] dp){
    //     if(i>j) return 0;
    //     int min=Integer.MAX_VALUE;
    //     if(dp[i][j]!=-1)    return dp[i][j];
    //     for(int ind=i;ind<=j;ind++){
    //         int cost=arr[j+1]-arr[i-1]+recur(i,ind-1,arr,dp)+recur(ind+1,j,arr,dp);
    //         min=Math.min(min,cost);
    //     }
    //     return dp[i][j]=min;
    // }
    public int minCost(int n, int[] cuts) {
        List<Integer> lis=new ArrayList<>();
        lis.add(0);
        for(int i=0;i<cuts.length;i++)  lis.add(cuts[i]);
        lis.add(n);
        int[] arr=new int[lis.size()];
        for(int i=0;i<lis.size();i++){
            arr[i]=lis.get(i);
        }
        Arrays.sort(arr);
        int n1=cuts.length;
        int[][] dp=new int[n1+2][n1+2];
        for(int i=n1;i>=1;i--){
            for(int j=1;j<=n1;j++){
                if(i>j) continue;
                int min=Integer.MAX_VALUE;
                for(int ind=i;ind<=j;ind++){
                    int cost=arr[j+1]-arr[i-1]+dp[i][ind-1]+dp[ind+1][j];
                    min=Math.min(min,cost);
                }
                dp[i][j]=min;
            }
        }
        return dp[1][n1];
    }
}