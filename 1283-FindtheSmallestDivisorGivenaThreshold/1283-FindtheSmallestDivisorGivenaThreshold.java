// Last updated: 15/06/2026, 18:12:01
1class Solution {
2    public boolean helper(int[] nums,int mid,int k){
3        int cnt=1;
4        int sum=0;
5        for(int num:nums){
6            sum+=num;
7            if(sum>mid){
8                cnt++;
9                sum=num;
10            }
11        }
12        return cnt<=k;
13    }
14    public int splitArray(int[] nums, int k) {
15        int sum=0;
16        int max=0;
17        for(int num:nums){
18            sum+=num;
19            max=Math.max(max,num);
20        }
21        int l=max;
22        int r=sum;
23        while(l<=r){
24            int mid=(l+r)/2;
25            if(helper(nums,mid,k)){
26                r=mid-1;
27            }
28            else{
29                l=mid+1;
30            }
31        }
32        return l;
33    }
34}