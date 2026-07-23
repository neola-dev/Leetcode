// Last updated: 23/07/2026, 09:25:02
1class Solution {
2    public int recur(int i,int j,int[] arr,int[][] dp){
3        if(i>j) return 0;
4        if(dp[i][j]!=-1) return dp[i][j];
5        int min=Integer.MAX_VALUE;
6        for(int k=i;k<=j;k++){
7            int cost=arr[j+1]-arr[i-1]+recur(i,k-1,arr,dp)+recur(k+1,j,arr,dp);
8            min=Math.min(cost,min);
9        }
10        return dp[i][j]=min;
11    }
12    public int minCost(int n, int[] cuts) {
13        List<Integer> lis=new ArrayList<>();
14        lis.add(0);
15        for(int i=0;i<cuts.length;i++){
16            lis.add(cuts[i]);
17        }
18        lis.add(n);
19        int[] arr=new int[lis.size()];
20        for(int i=0;i<lis.size();i++){
21            arr[i]=lis.get(i);
22        }
23        int n1=cuts.length;
24        int[][] dp=new int[n1+1][n1+1];
25        for(int i=0;i<=n1;i++){
26            for(int j=0;j<=n1;j++){
27                dp[i][j]=-1;
28            }
29        }
30        Arrays.sort(arr);
31        return recur(1,cuts.length,arr,dp);
32    }
33}