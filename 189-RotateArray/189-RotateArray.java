// Last updated: 04/06/2026, 11:18:08
class Solution {
    public void rev(int st,int end,int[] nums){
        while(st<=end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        rev(0,n-1,nums);
        rev(0,k-1,nums);
        rev(k,n-1,nums);
    }
}