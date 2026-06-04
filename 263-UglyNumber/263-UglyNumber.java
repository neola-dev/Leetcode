// Last updated: 04/06/2026, 11:17:11
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        while(n%2==0) n/=2;
        while(n%3==0) n/=3;
        while(n%5==0) n/=5;
        return (n==1);
    }
}