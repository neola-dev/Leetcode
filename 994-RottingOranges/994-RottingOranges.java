// Last updated: 27/07/2026, 11:55:20
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int n = grid.length;
4        int m = grid[0].length;
5        Queue<int[]> q = new LinkedList<>();
6        int fresh = 0;
7        for (int i = 0; i < n; i++) {
8            for (int j = 0; j < m; j++) {
9                if (grid[i][j] == 2) {
10                    q.add(new int[] { i, j });
11                }
12                if (grid[i][j] == 1) {
13                    fresh++;
14                }
15            }
16        }
17        int[] dir={-1,1,0,0}; //up,down,left,right
18        int[] dic={0,0,-1,1}; //up,down,left,right
19        int time=0;
20        while(!q.isEmpty() && fresh>0){ //don't forget to add fresh>0
21            int size=q.size();
22            for(int i=0;i<size;i++){
23                int[] curr=q.poll();
24                int r=curr[0];
25                int c=curr[1];
26                for(int j=0;j<4;j++){
27                    int newR=r+dir[j];
28                    int newC=c+dic[j];
29                    if(newR>=0 && newC>=0 && newR<n && newC<m && grid[newR][newC]==1){
30                        grid[newR][newC]=2;
31                        q.add(new int[]{newR,newC});
32                        fresh--;
33                    }
34                }
35            }
36            time++;
37        }
38        if(fresh!=0)    return -1;
39        return time;
40    }
41}