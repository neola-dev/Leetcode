// Last updated: 19/08/2026, 14:13:18
1class Solution {
2    public long minCost(int[] nums, int[] cost) {
3        int min=Integer.MAX_VALUE;
4        int max=Integer.MIN_VALUE;
5        for(int num:nums){
6            min=Math.min(min,num);
7            max=Math.max(max,num);
8        }
9        long low=min;
10        long high=max;
11        long ans=0;
12        while(low<=high){
13            long mid=(low+high)/2;
14            long x=count(mid,nums,cost);
15            long y=count(mid+1,nums,cost);
16            ans=Math.min(x,y);
17            if(x<=y){
18                high=mid-1;
19            }
20            else{
21                low=mid+1;
22            }
23        }
24        return ans;
25    }
26    public long count(long mid,int[] nums,int[] cost){
27        long cnt=0;
28        for(int i=0;i<nums.length;i++){
29            long ans=(Math.abs(mid-nums[i]))*cost[i];
30            cnt+=ans;
31        }
32        return cnt;
33    }
34}