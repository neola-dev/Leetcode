// Last updated: 04/06/2026, 11:10:57
class Solution {
    public String triangleType(int[] nums) {
        boolean triangle=nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1];
        if(triangle && nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        }
        else if(triangle && (nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2])){
            return "isosceles";
        }
        else if(triangle && nums[0]!=nums[1] && nums[1]!=nums[2]){
            return "scalene";
        }
        return "none";
    }
}