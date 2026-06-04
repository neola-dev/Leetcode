// Last updated: 04/06/2026, 11:10:34
class Solution {
    public long countCommas(long n) {
        long ans=0;
        for(int k=1; ;k++){
            long st=(long)Math.pow(10,3*k);
            if(st>n)    break;
            long end=Math.min(n,(long)Math.pow(10,3*(k+1))-1);
            long cnt=end-st+1;
            ans+=cnt*k;
        }
        return ans;
    }
}