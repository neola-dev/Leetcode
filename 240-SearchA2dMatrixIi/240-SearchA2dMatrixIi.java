// Last updated: 04/06/2026, 11:17:20
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int nr=matrix.length;
        int nc=matrix[0].length;
        int row=0;
        int col=nc-1;
        while(row<nr && col>=0){
            if(matrix[row][col]==target)    return true;
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}