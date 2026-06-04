// Last updated: 04/06/2026, 11:10:49
class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long[] rowSum=new long[n];
        long[] colSum=new long[m];
        long totRowSum=0;
        long totColSum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rowSum[i]+=grid[i][j];
                colSum[j]+=grid[i][j];
            }
        }
        for(int i=0;i<n;i++)    totRowSum+=rowSum[i];
        for(int j=0;j<m;j++)    totColSum+=colSum[j];
        long preRowSum=0;
        for(int i=0;i<n;i++){
            preRowSum+=rowSum[i];
            long rem=totRowSum-preRowSum;
            if(preRowSum==rem)  return true;
        }
        long preColSum=0;
        for(int j=0;j<m;j++){
            preColSum+=colSum[j];
            long rem=totColSum-preColSum;
            if(preColSum==rem)  return true;
        }
        return false;
    }
}