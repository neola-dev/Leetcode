// Last updated: 07/09/2026, 15:16:58
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> set=new HashSet<>();
4        int l=0;
5        int r=0;
6        int max=0;
7        while(r<s.length()){
8            char chR=s.charAt(r);
9            while(set.contains(chR)){
10                char chL=s.charAt(l);
11                set.remove(chL);
12                l++;
13            }
14            max=Math.max(max,(r-l+1));
15            set.add(chR);
16            r++;
17        }
18        return max;
19    }
20}