// Last updated: 26/06/2026, 13:09:48
1class Solution {
2    public static void recur(int ind,int[] nums,List<List<Integer>> res,List<Integer> sub,int n){
3        if(ind==n){
4            if(!res.contains(sub)) res.add(new ArrayList<>(sub));
5            return;
6        }
7        sub.add(nums[ind]);
8        recur(ind+1,nums,res,sub,n);
9        sub.remove(sub.size()-1);
10        recur(ind+1,nums,res,sub,n);
11    }
12    public List<List<Integer>> subsetsWithDup(int[] nums) {
13        List<List<Integer>> res=new ArrayList<>();
14        Arrays.sort(nums);
15        recur(0,nums,res,new ArrayList<>(),nums.length);
16        return res;
17    }
18}