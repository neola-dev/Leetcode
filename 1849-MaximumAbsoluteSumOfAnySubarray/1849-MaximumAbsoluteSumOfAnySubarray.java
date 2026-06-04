// Last updated: 04/06/2026, 11:12:06
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0;
        int min=0;
        int maxSum=0;
        int minSum=0;
        int ans=0;
        for(int num:nums){
            max=Math.max(num,max+num);
            maxSum=Math.max(maxSum,max);
            min=Math.min(num,min+num);
            minSum=Math.min(minSum,min);
            ans=Math.max(maxSum,Math.abs(minSum));
        }
        return ans;
    }
}