// Last updated: 04/06/2026, 11:15:30
class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int presum=0;
        for(int num:nums){
            presum+=num;
            int rem=presum-k;
            cnt+=map.getOrDefault(rem,0);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}