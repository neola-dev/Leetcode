// Last updated: 04/06/2026, 11:20:59
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int min=Integer.MAX_VALUE;
       int ans=0;
       for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return target;
                else if(sum<target)  j++;
                else k--;
                if(Math.abs(sum-target)<min){
                    min=Math.abs(sum-target);
                    ans=sum;
                }
            }
       }
       return ans;
    }
}