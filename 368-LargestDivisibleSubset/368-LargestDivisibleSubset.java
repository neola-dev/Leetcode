// Last updated: 04/06/2026, 11:16:37
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        Arrays.fill(dp,1);
        int lastInd=0;
        int max=1;
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int prev=0;prev<i;prev++){
                if((nums[i]%nums[prev]==0 || nums[prev]%nums[i]==0) && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                    hash[i]=prev;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                lastInd=i;
            }
        }
        List<Integer> res=new ArrayList<>();
        res.add(nums[lastInd]);
        while(hash[lastInd]!=lastInd){
            lastInd=hash[lastInd];
            res.add(nums[lastInd]);
        }
        return res;
    }
}