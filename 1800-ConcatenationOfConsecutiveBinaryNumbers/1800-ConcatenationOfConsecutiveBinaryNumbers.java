// Last updated: 04/06/2026, 11:12:11
class Solution {
    public int concatenatedBinary(int n) {
        long res=0;
        int mod=1000000007;
        int bitLength=0;
        for(int i=1;i<=n;i++){
            if((i & (i-1))==0){
                bitLength++; //bit length inc when it is a pow of 2 or else same
            }
            res=((res<<bitLength)+i)%mod; //res<<bitlength -> make space for curr num & add it
        }
        return (int)res;
    }
}