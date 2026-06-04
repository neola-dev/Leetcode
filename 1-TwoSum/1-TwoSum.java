// Last updated: 04/06/2026, 11:21:16
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(hmap.containsKey(rem)){
                res[0]=i;
                res[1]=hmap.get(rem);
            }
            hmap.put(nums[i],i);
        }
        return res;
    }
}