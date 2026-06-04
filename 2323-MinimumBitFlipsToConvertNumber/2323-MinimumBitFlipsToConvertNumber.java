// Last updated: 04/06/2026, 11:11:31
class Solution {
    public int minBitFlips(int start, int goal) {
        int res=start^goal;
        int cnt=0;
        while(res>0){
            cnt+=res&1;
            res=res>>1;
        }
        return cnt;
    }
}