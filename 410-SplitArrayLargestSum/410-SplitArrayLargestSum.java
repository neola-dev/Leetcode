// Last updated: 04/06/2026, 11:16:24
class Solution {
    public boolean helper(int[] nums,int mid,int k){
        int cnt=1;
        int sum=0;
        for(int num:nums){
            if(num>mid){
                return false;
            }
            sum+=num;
            if(sum>mid){
                cnt++;
                sum=num;
            }
        }
        return cnt<=k;
    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int num:nums){
            sum+=num;
            max=Math.max(max,num);
        }
        int l=max;
        int r=sum;
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(helper(nums,mid,k)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}