// Last updated: 04/06/2026, 11:16:52
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)    return true;
        if(n%3!=0 || n<=0)  return false;
        return isPowerOfThree(n/3);
    }
}