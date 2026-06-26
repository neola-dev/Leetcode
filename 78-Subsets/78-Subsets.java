// Last updated: 26/06/2026, 13:56:02
1class Solution {
2    public void recur(int ind,int[] arr,int target,List<List<Integer>> res,List<Integer> sub){
3        if(target==0){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=ind;i<arr.length;i++){
8            if(i>ind && arr[i]==arr[i-1]) continue;
9            if(arr[i]>target)   break;
10            sub.add(arr[i]);
11            recur(i+1,arr,target-arr[i],res,sub);
12            sub.remove(sub.size()-1);
13        }
14    }
15    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
16        List<List<Integer>> res=new ArrayList<>();
17        Arrays.sort(candidates);
18        recur(0,candidates,target,res,new ArrayList<>());
19        return res;
20    }
21}