// Last updated: 20/08/2026, 21:46:56
1class Solution {
2    public int arrangeCoins(int n) {
3        int low=1;
4        int high=n;
5        int ans=0;
6        while(low<=high){
7            int mid=low+(high-low)/2;
8            long req=(long)mid*(mid+1)/2;
9            if(req>n){
10                high=mid-1;
11            }
12            else{
13                ans=mid;
14                low=mid+1;
15            }
16        }
17        return ans;
18    }
19}