// Last updated: 04/06/2026, 11:14:56
class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(nums.length<k)   return false;
        int total=0;
        for(int num:nums)   total+=num;
        if(total%k!=0)  return false;
        int target=total/k;
        Arrays.sort(nums);
        rev(nums);
        int[] sides=new int[k];
        return helper(0,nums,sides,target);
    }
    public boolean helper(int ind,int[] nums,int[] sides,int target){
        if(ind==nums.length){
            for(int i=0;i<sides.length;i++){
                if(sides[i]!=target)    return false;
            }
            return true;
        }
        for(int i=0;i<sides.length;i++){
            if(sides[i]+nums[ind]>target)   continue;
            sides[i]+=nums[ind];
            if(helper(ind+1,nums,sides,target)) return true;
            sides[i]-=nums[ind];
            if(sides[i]==0) break;
        }
        return false;
    }
    public void rev(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}