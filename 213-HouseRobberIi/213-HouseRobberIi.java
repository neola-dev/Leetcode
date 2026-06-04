// Last updated: 04/06/2026, 11:17:49
class Solution {
    //space opt sol for house robber 1
    public int rob1(int[] nums){
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1) take+=prev2;
            int nottake=0+prev1;
            int curri=Math.max(take,nottake);
            prev2=prev1;
            prev1=curri;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        int n=nums.length;
        if(n==1)    return nums[0];
        for(int i=0;i<nums.length;i++){
            if(i!=0)   temp1.add(nums[i]);
            if(i!=nums.length-1)    temp2.add(nums[i]);
        }
        int[] temp1Arr=new int[n-1];
        int[] temp2Arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            temp1Arr[i]=temp1.get(i);
            temp2Arr[i]=temp2.get(i);
        }    
        return Math.max(rob1(temp1Arr),rob1(temp2Arr));
    }
}