// Last updated: 04/06/2026, 11:10:47
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min=Integer.MAX_VALUE;
        int n=landStartTime.length;
        int m=waterStartTime.length;
        for(int i=0;i<n;i++){
            int dur=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
                int maxTime=Math.max(dur,waterStartTime[j]);
                min=Math.min(min,maxTime+waterDuration[j]);
            }
        }
        for(int i=0;i<m;i++){
            int dur=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++){
                int maxTime=Math.max(dur,landStartTime[j]);
                min=Math.min(min,maxTime+landDuration[j]);
            }
        }
        return min;
    }
}