// Last updated: 04/06/2026, 11:20:06
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        int n=intervals.length;
        List<int[]> ls=new ArrayList<>();
        //left
        while(i<n && intervals[i][1]<newInterval[0]){
            ls.add(intervals[i]);
            i++;
        }
        //overlapping
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i=i+1;
        }
        ls.add(newInterval);
        //right
        while(i<n){
            ls.add(intervals[i]);
            i++;
        }
        return ls.toArray(new int[ls.size()][]);
    }
}