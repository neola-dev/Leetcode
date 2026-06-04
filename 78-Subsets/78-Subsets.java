// Last updated: 04/06/2026, 11:19:42
class Solution {
    public void recursion(int ind,List<List<Integer>> res,List<Integer> sub,int[] nums,int n){
        if(ind==n){
            res.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[ind]);
        recursion(ind+1,res,sub,nums,n);
        sub.remove(sub.size()-1);
        recursion(ind+1,res,sub,nums,n);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int n=nums.length;
        recursion(0,res,sub,nums,n);
        return res;
    }
}