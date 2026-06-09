// Last updated: 09/06/2026, 09:07:21
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n=numbers.length;
4        int l=0;
5        int r=n-1;
6        while(l<r){
7            int sum=numbers[l]+numbers[r];
8            if(sum==target){
9                return new int[]{l+1,r+1};
10            }
11            else if(sum<target){
12                l++;
13            }
14            else{
15                r--;
16            }
17        }
18        return new int[]{-1,-1};
19    }
20}