// Last updated: 04/06/2026, 11:14:39
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                cnt++;
            }
        }
        return cnt;
    }
}