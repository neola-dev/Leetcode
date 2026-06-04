// Last updated: 04/06/2026, 11:19:55
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}