// Last updated: 04/06/2026, 11:17:51
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        while(r<n){
            int numR=nums[r];
            sum+=numR;
            while(sum>=target){
                min=Math.min(min,(r-l+1));
                int numL=nums[l];
                sum-=numL;
                l++;
            }
            r++;
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}