// Last updated: 04/06/2026, 11:19:45
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int m=0;
        while(m<=h){
            if(nums[m]==0){
                int t=nums[l];
                nums[l]=nums[m];
                nums[m]=t;
                l++;
                m++;
            }
            else if(nums[m]==1){
                m++;
            }
            else{
                int t=nums[h];
                nums[h]=nums[m];
                nums[m]=t;
                h--;
            }
        }
    }
}