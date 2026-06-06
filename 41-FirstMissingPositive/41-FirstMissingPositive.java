// Last updated: 06/06/2026, 09:06:35
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int last=Integer.MIN_VALUE;
5        for(int i=0;i<nums.length;i++){
6            map.put(nums[i],i);
7            last=Math.max(nums[i],last);
8        }
9        for(int i=1;i<=nums.length;i++){
10            if(!map.containsKey(i)){
11                return i;
12            }
13        }
14        return last+1;
15    }
16}