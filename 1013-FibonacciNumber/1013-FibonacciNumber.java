// Last updated: 04/06/2026, 11:13:47
class Solution {
    /*We can optimise space even from Tabulation Dp to Constant Space
    tc is O(N) and sc is O(1) for array
    */
    public int fib(int n) {
        if(n<=1)    return n;
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}