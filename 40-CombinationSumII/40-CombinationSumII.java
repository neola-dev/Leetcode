// Last updated: 24/07/2026, 23:00:30
1class Solution {
2    public void recur(int ind,List<List<Integer>> res,int[] arr,int target,List<Integer> sub){
3        if(target==0){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=ind;i<arr.length;i++){
8            if(i>ind && arr[i]==arr[i-1]) continue;
9            if(arr[i]>target) break;
10            sub.add(arr[i]);
11            recur(i+1,res,arr,target-arr[i],sub);
12            sub.remove(sub.size()-1);
13        }
14    }
15    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
16        List<List<Integer>> res=new ArrayList<>();
17        Arrays.sort(candidates);
18        recur(0,res,candidates,target,new ArrayList<>());
19        return res;
20    }
21}