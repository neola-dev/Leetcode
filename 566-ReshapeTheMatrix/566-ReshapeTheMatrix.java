// Last updated: 04/06/2026, 11:15:27
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ogr=mat.length;
        int ogc=mat[0].length;
        int[][] res=new int[r][c];
        if(ogr*ogc!=r*c){
            return mat;
        }
    
        for(int i=0;i<ogr*ogc;i++){
            int row=i/ogc;
            int col=i%ogc;
            int newrow=i/c;
            int newcol=i%c;
            res[newrow][newcol]=mat[row][col];
        }
        return res;
    }
}