// Last updated: 04/06/2026, 11:13:01
class Solution {
    public int find(int[] nums,int k){
        int l=0;
        int r=0;
        int oddCnt=0;
        int sub=0;
        while(r<nums.length){
            int num=nums[r];
            if(num%2==1)    oddCnt++;
            while(oddCnt>k){
                if(nums[l]%2==1)    oddCnt--;
                l++;
            }
            if(oddCnt<=k){
                sub+=(r-l+1);
            }
            r++;
        }
        return sub;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums,k)-find(nums,k-1);
    }
}