// Last updated: 04/06/2026, 11:16:59
class Solution {
    //length of LIS using binary search in order to optimize time but the temp array is not the LIS array
    public int lengthOfLIS(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        temp.add(nums[0]);
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>temp.get(temp.size()-1)){
                temp.add(nums[i]);
                len++;
            }
            else{
                int ind=lowerBound(nums[i],temp);
                temp.set(ind,nums[i]);
            }
        }
        return len;
    }
    public int lowerBound(int target,List<Integer> temp){
        int low=0;
        int high=temp.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(temp.get(mid)>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}