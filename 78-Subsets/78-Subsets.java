// Last updated: 26/06/2026, 14:09:19
1class Solution {
2    public void recur(int ind,int[] arr,int cnt,int k,int n,List<List<Integer>> res,List<Integer> sub){
3        if(cnt==k){
4            if(n==0){
5                res.add(new ArrayList<>(sub));
6            }
7            return;
8        }
9        if(ind>=arr.length || n<0)  return;
10        sub.add(arr[ind]);
11        recur(ind+1,arr,cnt+1,k,n-arr[ind],res,sub);
12        sub.remove(sub.size()-1);
13        recur(ind+1,arr,cnt,k,n,res,sub);
14    }
15    public List<List<Integer>> combinationSum3(int k, int n) {
16        List<List<Integer>> res=new ArrayList<>();
17        int[] arr={1,2,3,4,5,6,7,8,9};
18        recur(0,arr,0,k,n,res,new ArrayList<>());
19        return res;
20    }
21}