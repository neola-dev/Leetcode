// Last updated: 04/06/2026, 11:12:58
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prd=1;
        while(n>0){
            sum+=n%10;
            prd*=n%10;
            n=n/10;
        }
        return prd-sum;
    }
}