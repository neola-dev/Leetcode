// Last updated: 04/06/2026, 11:16:03
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int radius=0;
        int j=0;
        for(int i=0;i<houses.length;i++){
            int house=houses[i];
            while(j<heaters.length-1 && Math.abs(heaters[j+1]-house)<=Math.abs(heaters[j]-house)){
                j++;
            }
            radius=Math.max(radius,Math.abs(heaters[j]-house));
        }
        return radius;
    }
}