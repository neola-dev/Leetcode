// Last updated: 04/06/2026, 11:17:23
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            arr[i]=suffix;
            suffix=suffix*nums[i];
        }
        int prefix=1;
        for(int i=0;i<n;i++){
            arr[i]=prefix*arr[i];
            prefix=prefix*nums[i];
        }
        return arr;
    }
}