// Last updated: 04/06/2026, 11:11:18
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0;
        int r=0;
        long maxSum=0;
        long sum=0;
        Set<Integer> set=new HashSet<>();
        while(r<nums.length){
            while(set.contains(nums[r])){
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            sum+=nums[r];
            set.add(nums[r]);
            if((r-l+1)==k){
                maxSum=Math.max(maxSum,sum);
                sum-=nums[l];
                set.remove(nums[l]);
                l++;
            }
            r++;
        }
        return maxSum;
    }
}