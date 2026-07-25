// Last updated: 25/07/2026, 11:19:23
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Arrays.sort(nums);
4        Set<Integer> set=new HashSet<>();
5        for(int num:nums) set.add(num);
6        int maxCnt=0;
7        for(int num:set){
8            if(!set.contains(num-1)){
9                int cnt=1;
10                while(set.contains(num+1)){
11                    cnt++;
12                    num+=1;
13                }
14                maxCnt=Math.max(maxCnt,cnt);
15            }
16        }
17        return maxCnt;
18    }
19}