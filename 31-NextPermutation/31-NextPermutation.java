// Last updated: 04/06/2026, 11:20:38
class Solution {
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int st,int end,int[] nums){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //find first element smaller than prev element
        int firstSmallInd=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                firstSmallInd=i;
                break;
            }
        }
        if(firstSmallInd==-1){
            reverse(0,n-1,nums);
            return;
        }
        //find pivot ind which is first greater element from right to firstSmallInd element
        int pivotInd=-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[firstSmallInd]){
                pivotInd=i;
                break;
            }
        }
        swap(firstSmallInd,pivotInd,nums);
        reverse(firstSmallInd+1,n-1,nums);
        return;
    }
}