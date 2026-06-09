// Last updated: 09/06/2026, 21:18:30
1class Solution {
2    public int find(int[] nums,int goal){
3        int n=nums.length;
4        int l=0;
5        int r=0;
6        int cnt=0;
7        int sum=0;
8        if(goal<0) return 0;
9        while(r<n){
10            sum+=nums[r];
11            while(sum>goal){
12                sum-=nums[l];
13                l++;
14            }
15            cnt+=(r-l+1);
16            r++;
17        }
18        return cnt;
19    }
20    public int numSubarraysWithSum(int[] nums, int goal) {
21        int ans=find(nums,goal)-find(nums,goal-1);
22        return ans;
23    }
24}