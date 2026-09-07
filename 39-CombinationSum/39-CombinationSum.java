// Last updated: 07/09/2026, 14:38:54
1class Solution {
2    public void recur(int ind,int[] candidates,int target,List<List<Integer>> res,List<Integer> sub,int n){
3        if(ind==n){
4            if(target==0){
5                res.add(new ArrayList<>(sub));
6            }
7            return;
8        }
9        if(candidates[ind]<=target){
10            sub.add(candidates[ind]);
11            recur(ind,candidates,target-candidates[ind],res,sub,n);
12            sub.remove(sub.size()-1);
13        }
14        recur(ind+1,candidates,target,res,sub,n);
15    }
16    public List<List<Integer>> combinationSum(int[] candidates, int target) {
17        List<List<Integer>> res=new ArrayList<>();
18        int n=candidates.length;
19        recur(0,candidates,target,res,new ArrayList<>(),n);
20        return res;
21    }
22}