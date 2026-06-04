// Last updated: 04/06/2026, 11:12:00
class Solution {
    public int arraySign(int[] nums) {
        int cnt=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0)   return 0;
           if(nums[i]<0)    cnt++;
        }
        return cnt%2==0?1:-1;
    }
}