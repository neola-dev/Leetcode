// Last updated: 20/08/2026, 15:21:49
1class Solution {
2    public int findClosest(int x, int y, int z) {
3        if(Math.abs(z-x)<Math.abs(y-z)) return 1;
4        else if(Math.abs(z-x)>Math.abs(y-z)) return 2;
5        return 0;
6    }
7}