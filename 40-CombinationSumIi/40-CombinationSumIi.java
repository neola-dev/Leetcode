// Last updated: 04/06/2026, 11:20:28
class Solution {
    public static void helper(int ind,int[] arr,int target,int n,List<List<Integer>> res,List<Integer> sub){
        if(target==0){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && arr[i]==arr[i-1])   continue;
            if(arr[i]>target)   break;
            sub.add(arr[i]);
            helper(i+1,arr,target-arr[i],n,res,sub);
            sub.remove(sub.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        List<Integer> sub=new ArrayList<>();
        int n=candidates.length;
        Arrays.sort(candidates);
        helper(0,candidates,target,n,res,sub);
        return res;
    }
}