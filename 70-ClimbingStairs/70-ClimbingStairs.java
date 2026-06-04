// Last updated: 04/06/2026, 11:19:51
class Solution {
    public int climbStairs(int n) {
        if(n<=2)    return n;
        int prev2=1;
        int prev1=2;
        for(int i=3;i<=n;i++){
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}