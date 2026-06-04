// Last updated: 04/06/2026, 11:11:07
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cnt=0;
        int n=hours.length;
        for(int i=0;i<n;i++){
            if(hours[i]>=target){
                cnt++;
            }
        }
        return cnt;
    }
}