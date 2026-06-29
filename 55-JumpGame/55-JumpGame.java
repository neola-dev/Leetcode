// Last updated: 29/06/2026, 11:48:13
1class Solution {
2    public boolean isNStraightHand(int[] hand, int groupSize) {
3        if(hand.length%groupSize!=0)    return false;
4        TreeMap<Integer,Integer> tm=new TreeMap<>();
5        for(int num:hand){
6            tm.put(num,tm.getOrDefault(num,0)+1);
7        }
8        while(!tm.isEmpty()){
9            int first=tm.firstKey();
10            for(int i=0;i<groupSize;i++){
11                int next=first+i;
12                if(!tm.containsKey(next))   return false;
13                if(tm.get(next)==1) tm.remove(next);
14                else tm.put(next,tm.get(next)-1);
15            }
16        }
17        return true;
18    }
19}