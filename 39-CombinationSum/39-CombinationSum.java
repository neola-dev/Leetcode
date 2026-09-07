// Last updated: 07/09/2026, 14:43:46
1class Solution {
2    public void recur(int[] nums,List<List<Integer>> res,List<Integer> sub,boolean[] vis,int n){
3        if(sub.size()==n){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=0;i<n;i++){
8            if(vis[i]) continue;
9            sub.add(nums[i]);
10            vis[i]=true;
11            recur(nums,res,sub,vis,n);
12            sub.remove(sub.size()-1);
13            vis[i]=false;
14        }
15    }
16    public List<List<Integer>> permute(int[] nums) {
17        List<List<Integer>> res=new ArrayList<>();
18        int n=nums.length;
19        boolean[] vis=new boolean[n];
20        recur(nums,res,new ArrayList<>(),vis,n);
21        return res;
22    }
23}