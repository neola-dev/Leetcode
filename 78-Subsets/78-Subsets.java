// Last updated: 26/06/2026, 13:09:14
1class Solution {
2    public static void find(int ind,int[] nums,List<List<Integer>> res,List<Integer> ds){
3        res.add(new ArrayList<>(ds));
4        for(int i=ind;i<nums.length;i++){
5            if(i!=ind && nums[i]==nums[i-1]) continue;
6            ds.add(nums[i]);
7            find(i+1,nums,res,ds);
8            ds.remove(ds.size()-1);
9        }
10    }
11    public List<List<Integer>> subsetsWithDup(int[] nums) {
12        List<List<Integer>> res=new ArrayList<>();
13        Arrays.sort(nums);
14        find(0,nums,res,new ArrayList<>());
15        return res;
16    }
17}