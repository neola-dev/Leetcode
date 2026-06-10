// Last updated: 10/06/2026, 09:00:12
1class Solution {
2    public int find(int[] nums,int k){
3        int l=0;
4        int r=0;
5        int cnt=0;
6        int oddCnt=0;
7        while(r<nums.length){
8            if(nums[r]%2==1){
9                oddCnt++;
10            }
11            while(oddCnt>k){
12                if(nums[l]%2==1)    oddCnt--;
13                l++;
14            }
15            if(oddCnt<=k)   cnt+=(r-l+1);
16            r++;
17        }
18        return cnt;
19    }
20    public int numberOfSubarrays(int[] nums, int k) {
21        int ans=find(nums,k)-find(nums,k-1);
22        return ans;
23    }
24}