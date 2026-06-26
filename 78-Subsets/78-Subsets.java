// Last updated: 26/06/2026, 13:48:58
1class Solution {
2    public static void helper(int ind,int[] arr,int target,int n,List<List<Integer>> res,List<Integer> sub){
3        if(target==0){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=ind;i<n;i++){
8            if(i>ind && arr[i]==arr[i-1])   continue;
9            if(arr[i]>target)   break;
10            sub.add(arr[i]);
11            helper(i+1,arr,target-arr[i],n,res,sub);
12            sub.remove(sub.size()-1);
13        }
14    }
15    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
16        ArrayList<List<Integer>> res=new ArrayList<>();
17        List<Integer> sub=new ArrayList<>();
18        int n=candidates.length;
19        Arrays.sort(candidates);
20        helper(0,candidates,target,n,res,sub);
21        return res;
22    }
23}