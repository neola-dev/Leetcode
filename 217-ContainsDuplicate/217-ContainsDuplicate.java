// Last updated: 04/06/2026, 11:17:44
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
            if(set.contains(num))   return true;
            set.add(num);
       } 
       return false;
    }
}