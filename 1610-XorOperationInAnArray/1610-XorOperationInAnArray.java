// Last updated: 04/06/2026, 11:12:26
class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            xor^=nums[i];
        }
        return xor;
    }
}