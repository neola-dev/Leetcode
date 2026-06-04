// Last updated: 04/06/2026, 11:10:32
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<capacity.length;i++){
            if(!map.containsKey(capacity[i])) map.put(capacity[i],i);
        }
        Arrays.sort(capacity);
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                return map.get(capacity[i]);
            }
        }
        return -1;
    }
}