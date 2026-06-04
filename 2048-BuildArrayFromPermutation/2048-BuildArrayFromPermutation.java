// Last updated: 04/06/2026, 11:11:49
class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}