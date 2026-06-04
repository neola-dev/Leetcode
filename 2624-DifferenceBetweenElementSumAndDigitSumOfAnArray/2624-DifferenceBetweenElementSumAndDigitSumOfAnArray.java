// Last updated: 04/06/2026, 11:11:15
class Solution {
    public int differenceOfSum(int[] nums) {
        int elmtSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            elmtSum+=nums[i];
            int ans=nums[i];
            while(ans>0){
                digitSum+=ans%10;
                ans=ans/10;
            }
        }
        return elmtSum-digitSum;
    }
}