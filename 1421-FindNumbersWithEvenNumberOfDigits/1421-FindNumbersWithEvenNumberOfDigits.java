// Last updated: 04/06/2026, 11:12:54
class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int length=0;
            int temp=nums[i];
            while(temp>0){
                length++;
                temp=temp/10;
            }
            if(length%2==0) cnt++;
        }
        return cnt;
    }
}