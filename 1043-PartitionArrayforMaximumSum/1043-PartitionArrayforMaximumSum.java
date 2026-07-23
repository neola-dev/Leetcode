// Last updated: 23/07/2026, 10:26:03
1class Solution {
2    public int recur(int i,int[] arr,int[] dp,int k){
3        if(i==arr.length) return 0;
4        if(dp[i]!=-1) return dp[i];
5        int max=Integer.MIN_VALUE;
6        int maxSum=Integer.MIN_VALUE;
7        int len=0;
8        for(int j=i;j<Math.min(i+k,arr.length);j++){
9            max=Math.max(max,arr[j]);
10            len++;
11            int sum=(len*max)+recur(j+1,arr,dp,k);
12            maxSum=Math.max(maxSum,sum);
13        }
14        return dp[i]=maxSum;
15    }
16    public int maxSumAfterPartitioning(int[] arr, int k) {
17        int n=arr.length;
18        int[] dp=new int[n];
19        for(int i=0;i<n;i++){
20            dp[i]=-1;
21        }
22        return recur(0,arr,dp,k);
23    }
24}