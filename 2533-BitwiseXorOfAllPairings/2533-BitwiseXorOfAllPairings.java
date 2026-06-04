// Last updated: 04/06/2026, 11:11:19
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int xor1=0;
        int xor2=0;
        if(n1%2!=0){
            for(int i=0;i<n2;i++){
                xor2=xor2^nums2[i];
            }
        }
        if(n2%2!=0){
            for(int i=0;i<n1;i++){
                xor1=xor1^nums1[i];
            }
        }
        return xor1^xor2;
    }
}