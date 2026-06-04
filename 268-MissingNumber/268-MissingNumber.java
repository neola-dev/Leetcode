// Last updated: 04/06/2026, 11:17:10
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=n;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return res;
    }
}