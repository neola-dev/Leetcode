// Last updated: 04/06/2026, 11:18:34
class Solution {
    public int maxProduct(int[] nums) {
        int prePrd=1;
        int suffPrd=1;
        int max=0;
        if(nums.length==1)  return nums[0];
        for(int i=0;i<nums.length;i++){
            if(prePrd==0)   prePrd=1;
            if(suffPrd==0)  suffPrd=1;
            prePrd*=nums[i];
            suffPrd*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(prePrd,suffPrd));
        }
        return max;
    }
}