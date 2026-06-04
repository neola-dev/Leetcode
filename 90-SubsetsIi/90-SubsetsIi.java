// Last updated: 04/06/2026, 11:19:31
class Solution {
    public static void find(int ind,int[] nums,List<List<Integer>> res,List<Integer> ds){
        res.add(new ArrayList<>(ds));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            find(i+1,nums,res,ds);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        find(0,nums,res,new ArrayList<>());
        return res;
    }
}