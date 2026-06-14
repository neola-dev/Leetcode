// Last updated: 14/06/2026, 17:06:01
1class Solution {
2    public int findLowerBound(int[] nums,int x){
3        int l=0;
4        int h=nums.length-1;
5        int ans=-1;
6        while(l<=h){
7            int m=l+(h-l)/2;
8            if(nums[m]==x){
9                ans=m;
10                h=m-1;
11            }
12            else if(nums[m]>x){
13                h=m-1;
14            }
15            else{
16                l=m+1;
17            }
18        }
19        return ans;
20    }
21     public int findUpperBound(int[] nums,int x){
22        int l=0;
23        int h=nums.length-1;
24        int ans=-1;
25        while(l<=h){
26            int m=l+(h-l)/2;
27            if(nums[m]==x){
28                ans=m;
29                l=m+1;
30            }
31            else if(nums[m]>x){
32                h=m-1;
33            }
34            else{
35                l=m+1;
36            }
37        }
38        return ans;
39    }
40    public int[] searchRange(int[] nums, int target) {
41        int lb=findLowerBound(nums,target);
42        int ub=findUpperBound(nums,target);
43        return new int[]{lb,ub};
44    }
45}