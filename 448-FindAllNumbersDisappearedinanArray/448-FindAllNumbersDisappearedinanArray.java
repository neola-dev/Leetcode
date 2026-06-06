// Last updated: 06/06/2026, 09:43:36
1class Solution {
2    public List<Integer> findDuplicates(int[] nums) {
3        int n=nums.length;
4        int i=0;
5        List<Integer> res=new ArrayList<>();
6        while(i<n){
7            int crt=nums[i]-1;
8            if(nums[i]!=nums[crt]){
9                int temp=nums[i];
10                nums[i]=nums[crt];
11                nums[crt]=temp;
12            }
13            else{
14                i++;
15            }
16        }
17        for(int j=0;j<n;j++){
18            if(nums[j]!=j+1){
19                res.add(nums[j]);
20            }
21        }
22        return res;
23    }
24}