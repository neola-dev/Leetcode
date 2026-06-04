// Last updated: 04/06/2026, 11:10:52
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(i-k>=0 && i+k<n){
                if(num>nums[i+k] && num>nums[i-k]){
                    sum+=num;
                }    
            }
            else if(i-k>=0 && i+k>=n){
                if(num>nums[i-k]){
                    sum+=num;
                }  
            }
            else if(i-k<0 && i+k<n){
                if(num>nums[i+k]){
                    sum+=num;
                }  
            }
            else{
                continue;
            }
        }
        return sum;
    }
}