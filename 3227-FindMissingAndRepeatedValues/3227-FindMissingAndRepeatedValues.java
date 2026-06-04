// Last updated: 04/06/2026, 11:11:02
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid.length;
        long sn=(long)(n*(n+1))/2;
        long s2n=(long)(n*(n+1)*(2L*n+1))/6;
        long s1=0,s2=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                s1+=grid[i][j];
                s2+=grid[i][j]*grid[i][j];
            }
        }
        long val1=s1-sn;
        long val2=s2-s2n;
        val2=val2/val1;
        long x=(val1+val2)/2;
        long y=x-val1;
        return new int[]{(int)x,(int)y};
    }
}