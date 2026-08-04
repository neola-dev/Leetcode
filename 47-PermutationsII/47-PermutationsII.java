// Last updated: 04/08/2026, 21:30:50
1class Solution {
2    public void recur(int[] nums,List<List<Integer>> res,List<Integer> sub,boolean[] vis){
3        if(sub.size()==nums.length){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=0;i<nums.length;i++){
8            if(vis[i])  continue;
9            if(i>0 && nums[i]==nums[i-1] && !vis[i-1])   continue;
10            sub.add(nums[i]);
11            vis[i]=true;
12            recur(nums,res,sub,vis);
13            sub.remove(sub.size()-1);
14            vis[i]=false;
15        }
16    }
17    public List<List<Integer>> permuteUnique(int[] nums) {
18        List<List<Integer>> res=new ArrayList<>();
19        int n=nums.length;
20        Arrays.sort(nums);
21        boolean[] vis=new  boolean[n];
22        recur(nums,res,new ArrayList<>(),vis);
23        return res;
24    }
25}