// Last updated: 30/06/2026, 10:07:29
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
4        List<int[]> res=new ArrayList<>();
5        for(int[] inter:intervals){
6            if(!res.isEmpty() && res.getLast()[1]>=inter[0]){
7                res.getLast()[1]=Math.max(res.getLast()[1],inter[1]);
8            }
9            else{
10                res.add(inter);
11            }
12        }
13        return res.toArray(new int[res.size()][]);
14    }
15}