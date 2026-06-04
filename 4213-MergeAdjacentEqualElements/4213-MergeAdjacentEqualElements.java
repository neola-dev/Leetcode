// Last updated: 04/06/2026, 11:10:40
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        ArrayList<Long> res=new ArrayList<>();
        for(int num:nums){
            long curr=num;
            while(!res.isEmpty() && res.get(res.size()-1)==curr){
                curr+=res.remove(res.size()-1);
            }
            res.add(curr);
        }
        return res;
    }
}