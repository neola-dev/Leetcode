// Last updated: 04/06/2026, 11:15:20
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=1;
        int n=nums.length;
        int maxLen=0;
        while(r<n){
            int diff=nums[r]-nums[l];
            while(diff>1){
                l=l+1;
                diff=nums[r]-nums[l];
            }
            if(diff==1) maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}