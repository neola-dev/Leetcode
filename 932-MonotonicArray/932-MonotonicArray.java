// Last updated: 04/06/2026, 11:14:03
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=false;
        boolean dec=false;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] <= nums[i+1]){
                inc=true;
            }
            else{
                inc=false;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] >= nums[i+1]){
                dec=true;
            }
            else{
                dec=false;
                break;
            }
        }
        return inc||dec?true:false;

    }
}