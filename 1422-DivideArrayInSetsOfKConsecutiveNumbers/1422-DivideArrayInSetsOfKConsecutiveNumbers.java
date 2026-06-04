// Last updated: 04/06/2026, 11:12:52
class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length%k!=0)    return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        while(!map.isEmpty()){
            int first=map.firstKey();
            for(int i=0;i<k;i++){
                int  next=first+i;
                if(!map.containsKey(next)) return false;
                if(map.get(next)==1)    map.remove(next);
                else map.put(next,map.getOrDefault(next,0)-1);
            }
        }
        return true;
    }
}