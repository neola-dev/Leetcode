// Last updated: 14/06/2026, 17:28:55
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int n=matrix.length;
4        int m=matrix[0].length;
5        int low=0;
6        int high=n*m-1;
7        while(low<=high){
8            int mid=(low+high)/2;
9            int r=mid/m;
10            int c=mid%m;
11            if(matrix[r][c]==target){
12                return true;
13            }
14            else if(matrix[r][c]>target){
15                high=mid-1;
16            }
17            else{
18                low=mid+1;
19            }
20        }
21        return false;
22    }
23}