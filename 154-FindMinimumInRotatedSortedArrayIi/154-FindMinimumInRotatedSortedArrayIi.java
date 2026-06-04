// Last updated: 04/06/2026, 11:18:30
class Solution {
    public static int binarysearch(int[] arr,int n){
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else if(arr[mid]<arr[high]){
                high=mid;
            }
            else{
                high--;
            }
        }
        return arr[low];
    }
    public int findMin(int[] nums) {
        int n=nums.length;
        return binarysearch(nums,n);
    }
}