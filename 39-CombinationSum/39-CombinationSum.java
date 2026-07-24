// Last updated: 24/07/2026, 22:53:22
1class Solution {
2    public void recur(int ind,int[] candidates,int sum,int target,List<Integer> sub,List<List<Integer>> res){
3        if(ind==candidates.length){
4            if(sum==target){
5                res.add(new ArrayList<>(sub));
6            }
7            return;
8        }   
9        if(sum+candidates[ind]<=target){ 
10            sub.add(candidates[ind]);
11            recur(ind,candidates,sum+candidates[ind],target,sub,res);
12            sub.remove(sub.size()-1);
13        }    
14        recur(ind+1,candidates,sum,target,sub,res);
15    }
16    public List<List<Integer>> combinationSum(int[] candidates, int target) {
17        List<List<Integer>> res=new ArrayList<>();
18        recur(0,candidates,0,target,new ArrayList<>(),res);
19        return res;
20    }
21}