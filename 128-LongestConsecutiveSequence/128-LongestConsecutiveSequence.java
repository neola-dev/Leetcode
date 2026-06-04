// Last updated: 04/06/2026, 11:18:53
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)   set.add(num);
        int maxCnt=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int cnt=1;
                while(set.contains(num+1)){
                    cnt++;
                    num=num+1;
                }
                maxCnt=Math.max(maxCnt,cnt);
            }
        }
        return maxCnt;
    }
}