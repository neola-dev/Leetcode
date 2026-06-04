// Last updated: 04/06/2026, 11:11:00
class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int reach=0;
        int add=0;
        int i=0;
        while(reach<target){
            if(i<coins.length && coins[i]<=reach+1){
                reach+=coins[i];
                i++;
            }
            else{
                reach+=(reach+1);
                add++;
            }
        }
        return add;
    }
}