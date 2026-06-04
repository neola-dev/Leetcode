// Last updated: 04/06/2026, 11:15:15
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int prd1=nums[n-1]*nums[n-2]*nums[n-3];
        int prd2=nums[0]*nums[1]*nums[n-1];
        return Math.max(prd1,prd2);
    }
}