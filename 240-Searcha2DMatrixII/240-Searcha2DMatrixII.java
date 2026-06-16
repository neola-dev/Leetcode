// Last updated: 16/06/2026, 09:38:33
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int nr=matrix.length;
4        int nc=matrix[0].length;
5        int r=0;
6        int c=nc-1;
7        while(r<nr && c>=0){
8            if(matrix[r][c]==target)    return true;
9            if(matrix[r][c]>target){
10                c--;
11            }
12            else{
13                r++;
14            }
15        }
16        return false;
17    }
18}