// Last updated: 04/06/2026, 11:17:45
class Solution {
    public static void backtrack(int ind,int elmtcnt,int k,int n,int[] arr,List<List<Integer>> res,List<Integer> ds){
        if(elmtcnt==k){
            if(n==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(ind>=arr.length || n<0)  return;
        ds.add(arr[ind]);
        backtrack(ind+1,elmtcnt+1,k,n-arr[ind],arr,res,ds);
        ds.remove(ds.size()-1);
        backtrack(ind+1,elmtcnt,k,n,arr,res,ds);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> res=new ArrayList<>();
      int[] arr={1,2,3,4,5,6,7,8,9};
      backtrack(0,0,k,n,arr,res,new ArrayList<>());  
      return res;
    }
}