// Last updated: 04/06/2026, 11:15:17
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=n;
        int len=flowerbed.length;
        for(int i=0;i<flowerbed.length;i++){
          if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    cnt--;
                    if (cnt == 0) return true;
                }
            }  
        }
        return cnt<=0;
    }
}