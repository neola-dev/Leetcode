// Last updated: 25/07/2026, 11:18:06
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int num:nums)   set.add(num);
5        int maxCnt=0;
6        for(int num:set){
7            if(!set.contains(num-1)){
8                int cnt=1;
9                while(set.contains(num+1)){
10                    cnt++;
11                    num=num+1;
12                }
13                maxCnt=Math.max(maxCnt,cnt);
14            }
15        }
16        return maxCnt;
17    }
18}