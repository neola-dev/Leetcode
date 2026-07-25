// Last updated: 25/07/2026, 09:24:42
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int preSum=0;
5        map.put(0,1);
6        int cnt=0;
7        for(int i=0;i<nums.length;i++){
8            preSum+=nums[i];
9            int rem=preSum-k;
10            if(map.containsKey(rem)) cnt+=map.get(rem);
11            map.put(preSum,map.getOrDefault(preSum,0)+1);
12        }
13        return cnt;
14    }
15}