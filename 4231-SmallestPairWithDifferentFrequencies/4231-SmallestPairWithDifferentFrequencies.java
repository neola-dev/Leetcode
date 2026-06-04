// Last updated: 04/06/2026, 11:10:29
class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            set.add(nums[i]);
        }
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            int x=nums[i];
            for(int j=i+1;j<n;j++){
                int y=nums[j];
                if(x<y && map.get(x)!=map.get(y)){
                    res[0]=x;
                    res[1]=y;
                    return res;
                }
            }
        }
        return new int[]{-1,-1};
    }
}