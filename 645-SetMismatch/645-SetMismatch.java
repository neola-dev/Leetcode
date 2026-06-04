// Last updated: 04/06/2026, 11:15:09
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] res=new int[2];
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(nums[i]))    res[0]=nums[i];
            hs.add(nums[i]);
        }
        int sum=n*(n+1)/2;
        int sumGiven=0;
        for(int i=0;i<n;i++){
            sumGiven+=nums[i];
        }
        res[1]=res[0]+(sum-sumGiven);
        return res;
    }
}