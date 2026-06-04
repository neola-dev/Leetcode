// Last updated: 04/06/2026, 11:20:35
class Solution {
    //mistake made never miss nums[] don't check low<=target instead check nums[low]<=target
    public int binarySearch(int low,int high,int[] nums,int target){
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)   return mid;
            System.out.println(low+" "+mid+" "+high);
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        return binarySearch(0,n-1,nums,target);  
    }
}