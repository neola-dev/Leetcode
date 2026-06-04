// Last updated: 04/06/2026, 11:16:11
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int ind=nums[i]-1;
            if(nums[i]!=nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
            }
            else    i++;
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                al.add(i+1);
            }
        }
        return al;
    }
}