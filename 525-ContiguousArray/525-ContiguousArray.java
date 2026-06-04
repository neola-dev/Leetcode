// Last updated: 04/06/2026, 11:15:41
class Solution {
    public int findMaxLength(int[] nums) {
        int presum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)  presum-=1;
            else presum+=1;
            if(map.containsKey(presum)){
                maxLen=Math.max(maxLen,(i-map.get(presum)));
            }
            else{
                map.put(presum,i);
            }
        }
        return maxLen;
    }
}