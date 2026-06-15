// Last updated: 15/06/2026, 16:31:09
1class Solution {
2    public boolean find(int[] nums,int m,int t){
3        int sum=0;
4        for(int num:nums){
5            sum+=Math.ceil((double)num/m);
6        }
7        return sum<=t;
8    }
9    public int smallestDivisor(int[] nums, int threshold) {
10        int l=1;
11        int h=Integer.MIN_VALUE;
12        for(int num:nums){
13            h=Math.max(h,num);
14        }
15        int ans=-1;
16        while(l<=h){
17            int m=l+(h-l)/2;
18            boolean res=find(nums,m,threshold);
19            if(res){
20                ans=m;
21                h=m-1;
22            }
23            else{
24                l=m+1;
25            }
26        }
27        return ans;
28    }
29}