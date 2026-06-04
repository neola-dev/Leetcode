// Last updated: 04/06/2026, 11:17:35
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int elmt1=0;
        int c1=0;
        int elmt2=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(c1==0 && elmt2!=nums[i]){
                elmt1=nums[i];
                c1++;
            }
            else if(c2==0 && elmt1!=nums[i]){
                elmt2=nums[i];
                c2++;
            }
            else if(elmt1==nums[i]) c1++;
            else if(elmt2==nums[i]) c2++;
            else{
                c1--;
                c2--;
            }
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==elmt1){
                count1++;
            }
            else if(nums[i]==elmt2){
                count2++;
            }
        }
        if(count1>(int)nums.length/3){
            list.add(elmt1);
        }
        if(count2>(int)nums.length/3){
            list.add(elmt2);
        }
        return list;
    }
}