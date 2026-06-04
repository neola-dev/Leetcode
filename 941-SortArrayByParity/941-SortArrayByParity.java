// Last updated: 04/06/2026, 11:13:58
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int low=0;
        int mid=0;
        while(mid<nums.length){
            if(nums[mid]%2==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else{
                mid++;
            }
        }
        return nums;
    }
}