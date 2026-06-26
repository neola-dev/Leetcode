// Last updated: 26/06/2026, 18:44:26
1class Solution {
2    public boolean canPartitionKSubsets(int[] nums, int k) {
3        int n=nums.length;
4        if(n<k) return false;
5        int tot=0;
6        for(int num:nums)   tot+=num;
7        if(tot%k!=0)    return false;
8        int target=tot/k;
9        Arrays.sort(nums);
10        rev(nums);  
11        int[] sides=new int[k];
12        return recur(0,nums,sides,target); 
13    }
14    public boolean recur(int ind,int[] nums,int[] sides,int target){
15        if(ind==nums.length){
16            for(int i=0;i<sides.length;i++){
17                if(sides[i]!=target)    return false;
18            }
19            return true;
20        }
21        for(int i=0;i<sides.length;i++){
22            if(nums[ind]+sides[i]>target)   continue;
23            sides[i]+=nums[ind];
24            if(recur(ind+1,nums,sides,target))   return true;
25            sides[i]-=nums[ind];
26            if(sides[i]==0) break;
27        }
28        return false;
29    }
30    public void rev(int[] nums){
31        int l=0;
32        int r=nums.length-1;
33        while(l<=r){
34            int temp=nums[l];
35            nums[l]=nums[r];
36            nums[r]=temp;
37            l++;
38            r--;
39        }
40    }
41}