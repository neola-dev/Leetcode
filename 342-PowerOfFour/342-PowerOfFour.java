// Last updated: 04/06/2026, 11:16:47
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)    return true;
        if(n%4!=0 || n<=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}