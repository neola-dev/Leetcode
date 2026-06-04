// Last updated: 04/06/2026, 11:15:42
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int preSum=0;
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];
            int rem=preSum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2)   return true;
            }
            else{
                map.put(rem,i);
            }
        }
        return false;
    }
}