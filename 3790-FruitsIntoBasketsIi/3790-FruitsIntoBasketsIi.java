// Last updated: 04/06/2026, 11:10:50
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        for(int i=0;i<fruits.length;i++){
            int j=0;
            while(j<baskets.length){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    break;
                }
                else if(j==baskets.length-1){
                    count+=1;
                }
                j++;
            }
        }
        return count;
    }
}