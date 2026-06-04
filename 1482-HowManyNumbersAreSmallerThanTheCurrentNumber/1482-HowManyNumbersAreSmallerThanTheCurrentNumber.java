// Last updated: 04/06/2026, 11:12:40
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int smallercnt=0;
            for(int j=0;j<n;j++){
                if(j!=i && nums[j]<nums[i]){
                    smallercnt++;
                }
                temp[i]=smallercnt;
            }
        }
        return temp;
    }
}