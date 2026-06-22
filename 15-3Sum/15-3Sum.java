// Last updated: 22/06/2026, 20:18:31
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(i!=0 && nums[i]==nums[i-1])  continue;
7            int j=i+1;
8            int k=nums.length-1;
9            while(j<k){
10                int ans=nums[i]+nums[j]+nums[k];
11                if(ans<0){
12                    j++;
13                }
14                else if(ans>0){
15                    k--;
16                }
17                else{
18                    List<Integer> sub=Arrays.asList(nums[i],nums[j],nums[k]);
19                    res.add(sub);
20                    j++;
21                    k--;
22                    while(j<k && nums[j]==nums[j-1]){
23                        j++;
24                    }
25                    while(j<k && nums[k]==nums[k+1]){
26                        k--;
27                    }
28                }
29            }
30        }
31        return res;
32    }
33}