// Last updated: 04/06/2026, 11:13:46
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int cnt=0;
        for(int num:nums){
            prefixSum+=num;
            int rem=prefixSum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                cnt+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}