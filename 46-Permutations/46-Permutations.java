// Last updated: 04/06/2026, 11:20:21
class Solution {
    public void recursion(boolean[] vis,List<List<Integer>> res,List<Integer> sub,int[] nums,int n){
        if(sub.size()==n){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=0;i<n;i++){
            if(vis[i])  continue;
            vis[i]=true;
            sub.add(nums[i]);
            recursion(vis,res,sub,nums,n);
            sub.remove(sub.size()-1);
            vis[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int n=nums.length;
        boolean[] vis=new boolean[n];
        recursion(vis,res,sub,nums,n);
        return res;
    }
}