// Last updated: 04/06/2026, 11:11:03
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums); //[2,3,4,5]
        int[] res=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i+=2){
            res[index++]=nums[i+1];
            res[index++]=nums[i];
        }
        return res;
    }
}