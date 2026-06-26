// Last updated: 26/06/2026, 13:05:03
1class Solution {
2    public void recur(int ind,int[] nums,List<List<Integer>> res,List<Integer> sub,int n){
3        if(ind==n){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        //pick
8        sub.add(nums[ind]);
9        recur(ind+1,nums,res,sub,n); //move to next ind
10        sub.remove(sub.size()-1); //not pick
11        recur(ind+1,nums,res,sub,n); //move to next ind
12    }
13    public List<List<Integer>> subsets(int[] nums) {
14        List<List<Integer>> res=new ArrayList<>();
15        recur(0,nums,res,new ArrayList<>(),nums.length);
16        return res;
17    }
18}