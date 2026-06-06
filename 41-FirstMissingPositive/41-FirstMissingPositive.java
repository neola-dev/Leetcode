// Last updated: 06/06/2026, 09:27:06
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int n=nums.length;
4        int i=0;
5        while(i<n){
6            int crt=nums[i]-1;
7            if(nums[i]>0  && nums[i]<=n && nums[i]!=nums[crt]){
8                int temp=nums[i];
9                nums[i]=nums[crt];
10                nums[crt]=temp;
11            }
12            else{
13                i++;
14            }
15        }
16        for(int j=0;j<n;j++){
17            if(nums[j]!=j+1){
18                return j+1;
19            }
20        }
21        return n+1;
22    }
23}