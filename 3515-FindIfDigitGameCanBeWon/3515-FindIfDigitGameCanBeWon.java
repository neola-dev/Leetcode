// Last updated: 04/06/2026, 11:10:53
class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int singleSum=0;
        int doubleSum=0;
        for(int i=0;i<n;i++){
            if(nums[i]<10){
                singleSum+=nums[i];
            }
            else{
                doubleSum+=nums[i];
            }
        }
        return singleSum!=doubleSum;
    }
}