// Last updated: 22/07/2026, 10:14:52
1class Solution {
2    public int findNumberOfLIS(int[] nums) {
3        int n=nums.length;
4        int[] dp=new int[n];
5        int[] cnt=new int[n];
6        int max=1;
7        Arrays.fill(dp,1);
8        Arrays.fill(cnt,1);
9        for(int i=0;i<n;i++){
10            for(int prev=0;prev<i;prev++){
11                if(nums[prev]<nums[i] && dp[prev]+1>dp[i]){
12                    dp[i]=dp[prev]+1;
13                    cnt[i]=cnt[prev];
14                }
15                else if(nums[prev]<nums[i] && dp[prev]+1==dp[i]){
16                    cnt[i]+=cnt[prev];
17                }
18            }
19            if(dp[i]>max){
20                max=dp[i];
21            }
22        }
23        System.out.print(max);
24        int ans=0;
25        for(int i=0;i<n;i++){
26            if(dp[i]==max){
27                ans+=cnt[i];
28            }
29        }
30        return ans;
31    }
32}