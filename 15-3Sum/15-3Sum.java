// Last updated: 26/07/2026, 11:00:32
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> res=new ArrayList<>();
4        Arrays.sort(nums);
5        int n=nums.length;
6        for(int i=0;i<n;i++){
7            if(i!=0 && nums[i]==nums[i-1]) continue;
8            int j=i+1;
9            int k=n-1;
10            while(j<k){
11                long sum=nums[i]+nums[j]+nums[k];
12                if(sum==0){
13                    List<Integer> sub=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
14                    res.add(sub);
15                    j++;
16                    k--;
17                    while(j<k && nums[j]==nums[j-1]){
18                        j++;
19                    }
20                    while(j<k && nums[k+1]==nums[k]){
21                        k--;
22                    }
23                }
24                else if(sum<0){
25                    j++;
26                }
27                else{
28                    k--;
29                }
30            }
31        }
32        return res;
33    }
34}