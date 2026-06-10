// Last updated: 10/06/2026, 09:08:00
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int l=0;
4        int r=0;
5        int cnt=0;
6        HashMap<Character,Integer> map=new HashMap<>();
7        while(r<s.length()){
8            char chR=s.charAt(r);
9            map.put(chR,map.getOrDefault(chR,0)+1);
10            while(map.size()==3){
11                cnt+=s.length()-r;
12                char chL=s.charAt(l);
13                map.put(chL,map.getOrDefault(chL,0)-1);
14                if(map.get(chL)<=0) map.remove(chL);
15                l++;
16            }
17            r++;
18        }
19        return cnt;
20    }
21}