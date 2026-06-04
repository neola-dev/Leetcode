// Last updated: 04/06/2026, 11:10:38
class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int[] suff=new int[n];
        int suffNum=0;
        for(int i=n-1;i>=0;i--){
            suff[i]=suffNum+nums[i];  
            suffNum=suff[i];
            System.out.println(suff[i]);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(i!=n-1 && nums[i]>suff[i+1]/(n-(i+1))){
                cnt++;
            }
        }
        return cnt;
    }
}