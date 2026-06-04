// Last updated: 04/06/2026, 11:13:44
class Solution {
    public int[] sortedSquares(int[] nums) {
        /*for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;*/
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int mid=n-1;
        int right=n-1;
        while(mid>=0){
            int leftSq=nums[left]*nums[left];
            int rightSq=nums[right]*nums[right];
            if(leftSq>rightSq){
                res[mid]=leftSq;
                left++;
            }
            else{
                res[mid]=rightSq;
                right--;
            }
            mid--;
        }
        return res;
    }
}