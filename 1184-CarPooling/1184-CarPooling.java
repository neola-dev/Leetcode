// Last updated: 04/06/2026, 11:13:15
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max=0;
        for(int i=0;i<trips.length;i++){
            if(trips[i][2]>max)     max=trips[i][2];
        }
        int[] diff=new int[max+1];
        for(int i=0;i<trips.length;i++){
            int elmt=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            diff[start]+=elmt;
            diff[end]-=elmt;
        }
        int sum=0;
        for(int i=0;i<max+1;i++){
            sum+=diff[i];
            if(sum>capacity){
                return false;
            }
        }
        return true;
    }
}