// Last updated: 11/08/2026, 14:02:10
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int sum=0;
4        int cnt=0;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        map.put(0,1);
7        for(int i=0;i<nums.length;i++){
8            sum+=nums[i];
9            int rem=sum%k;
10            if(rem<0) rem+=k;
11            if(map.containsKey(rem)){
12                cnt+=map.get(rem);
13            } 
14            map.put(rem,map.getOrDefault(rem,0)+1);
15        }
16        return cnt;
17    }
18}