// Last updated: 07/09/2026, 14:46:53
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        HashMap<Integer,Integer> hmap=new HashMap<>();
4        int[] res=new int[2];
5        for(int i=0;i<nums.length;i++){
6            int rem=target-nums[i];
7            if(hmap.containsKey(rem)){
8                res[0]=i;
9                res[1]=hmap.get(rem);
10            }
11            hmap.put(nums[i],i);
12        }
13        return res;
14    }
15}