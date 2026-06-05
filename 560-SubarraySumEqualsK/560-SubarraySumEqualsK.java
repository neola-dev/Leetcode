// Last updated: 05/06/2026, 09:29:06
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        map.put(0,-1);
5        int preSum=0;
6        for(int i=0;i<nums.length;i++){
7            preSum+=nums[i];
8            int rem=preSum%k;
9            if(map.containsKey(rem)){
10                if(i-map.get(rem)>=2)   return true;
11            }
12            else{
13                map.put(rem,i);
14            }
15        }
16        return false;
17    }
18}