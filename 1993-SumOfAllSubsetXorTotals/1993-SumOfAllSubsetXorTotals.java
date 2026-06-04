// Last updated: 04/06/2026, 11:11:55
class Solution {
    public int subsetXORSum(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            res=res | nums[i];
        }
        return res<<(n-1);
    }
}