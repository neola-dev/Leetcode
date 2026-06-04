// Last updated: 04/06/2026, 11:14:16
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0)    return false;
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        for(int num:hand){
            tm.put(num,tm.getOrDefault(num,0)+1);
        }
        while(!tm.isEmpty()){
            int num=tm.firstKey();
            for(int i=0;i<groupSize;i++){
                int next=num+i;
                if(!tm.containsKey(next))  return false;
                if(tm.get(next)==1) tm.remove(next);
                else tm.put(next,tm.getOrDefault(next,0)-1);
            }
        }
        return true;
    }
}