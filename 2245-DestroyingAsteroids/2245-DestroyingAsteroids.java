// Last updated: 04/06/2026, 11:11:36
class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n=asteroids.length;
        Arrays.sort(asteroids);
        long m=mass;
        for(int i=0;i<n;i++){
            if(m>=asteroids[i]){
                m+=asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}