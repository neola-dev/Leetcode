// Last updated: 04/06/2026, 11:11:33
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp=nums.clone();
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<temp.length;i++){
            if(temp[i]>0){
                nums[posIndex]=temp[i];
                posIndex+=2;
            }  
            else{
                nums[negIndex]=temp[i];
                negIndex+=2;
            }    
        }
        return nums;
    }
}