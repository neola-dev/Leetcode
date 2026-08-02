// Last updated: 02/08/2026, 20:41:36
1class Solution {
2    public void recur(int ind,int[] arr,int n,int cnt,int k,List<List<Integer>> res,List<Integer> sub){
3        if(cnt==k){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        if(ind==n)  return;
8        sub.add(arr[ind]);
9        recur(ind+1,arr,n,cnt+1,k,res,sub);
10        sub.remove(sub.size()-1);
11        recur(ind+1,arr,n,cnt,k,res,sub);
12    }
13    public List<List<Integer>> combine(int n, int k) {
14        List<List<Integer>> res=new ArrayList<>();
15        int[] arr=new int[n];
16        for(int i=0;i<n;i++){
17            arr[i]=i+1;
18        }
19        recur(0,arr,n,0,k,res,new ArrayList<>());
20        return res;
21    }
22}