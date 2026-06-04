// Last updated: 04/06/2026, 11:21:01
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1])  continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int ans=nums[i]+nums[j]+nums[k];
                if(ans<0){
                    j++;
                }
                else if(ans>0){
                    k--;
                }
                else{
                    List<Integer> sub=Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(sub);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return res;
    }
}