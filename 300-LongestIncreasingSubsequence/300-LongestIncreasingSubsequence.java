// Last updated: 22/07/2026, 09:03:06
1class Solution {
2    // public int memo(int ind,int prev,int[] nums,int[][] dp,int n){
3    //     if(ind==n) return 0;
4    //     if(dp[ind][prev+1]!=-1) return dp[ind][prev+1];
5    //     int take=0;
6    //     int notTake=0;
7    //     if(prev==-1 || nums[prev]<nums[ind]){
8    //         take=1+memo(ind+1,ind,nums,dp,n);
9    //     }
10    //     notTake=0+memo(ind+1,prev,nums,dp,n);
11    //     return dp[ind][prev+1]=Math.max(take,notTake);
12    // }
13    public int lengthOfLIS(int[] nums) {
14        int n=nums.length;
15        int[] dp=new int[n];
16        int[] hash=new int[n];
17        for(int i=0;i<n;i++) dp[i]=1;
18        int max=1;
19        int lastInd=0;
20        for(int i=0;i<n;i++){
21            hash[i]=i;
22            for(int prev=0;prev<i;prev++){
23                if(nums[prev]<nums[i] && 1+dp[prev]>dp[i]){
24                    dp[i]=Math.max(dp[i],1+dp[prev]);
25                    hash[i]=prev;
26                }
27            }
28            if(dp[i]>max){
29                max=dp[i];
30                lastInd=i;
31            }
32        }
33        List<Integer> lis=new ArrayList<>();
34        lis.add(nums[lastInd]);
35        while(hash[lastInd]!=lastInd){
36            lastInd=hash[lastInd];
37            lis.add(nums[lastInd]);
38        }
39        Collections.reverse(lis);
40        System.out.print(lis);
41        return max;
42    }
43}