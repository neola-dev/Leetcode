// Last updated: 04/06/2026, 11:13:53
class Solution {
    public int find(int[] nums,int goal){
        int l=0;
        int r=0;
        int n=nums.length;
        int sum=0;
        int cnt=0;
        if(goal<0)  return 0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l+=1;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res=find(nums,goal)-find(nums,goal-1);
        return res;
        //we have to find all the possible subarr whose sum is less than or equal to goal
        //so..if you find out for goal=2
        //first find for subarr which has sum<=2....
        //sec find for subarr which has sum<=1...
        //then mathematically whose sum==goal will be first eqn-sec eqn
    }
}