// Last updated: 22/07/2026, 09:20:28
1class Solution {
2    public List<Integer> largestDivisibleSubset(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int[] dp=new int[n];
6        int[] hash=new int[n];
7        int max=1;
8        int lastInd=0;
9        Arrays.fill(dp,1);
10        for(int i=0;i<n;i++){
11            hash[i]=i;
12            for(int prev=0;prev<i;prev++){
13                if((nums[prev]%nums[i]==0 || nums[i]%nums[prev]==0) && dp[prev]+1>dp[i]){
14                    dp[i]=dp[prev]+1;
15                    hash[i]=prev;
16                }
17            }
18            if(dp[i]>max){
19                max=dp[i];
20                lastInd=i;
21            }
22        }
23        List<Integer> lis=new ArrayList<>();
24        lis.add(nums[lastInd]);
25        while(hash[lastInd]!=lastInd){
26            lastInd=hash[lastInd];
27            lis.add(nums[lastInd]);
28        }
29        Collections.reverse(lis);
30        return lis;
31    }
32}