// Last updated: 04/06/2026, 11:18:20
class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int elmt=-1;
        for(int num:nums){
            if(cnt==0){
                elmt=num;
                cnt++;
            }
            else if(elmt!=num){
                cnt--;
            }
            else{
                cnt++;
            }
        }
        return elmt;
    }
}