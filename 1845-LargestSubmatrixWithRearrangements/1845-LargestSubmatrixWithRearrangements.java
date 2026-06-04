// Last updated: 04/06/2026, 11:12:07
class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>0 && matrix[i][j]==1){
                    matrix[i][j]+=matrix[i-1][j];
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            int[] temp=matrix[i].clone();
            Arrays.sort(temp);
            int width=1;
            for(int j=m-1;j>=0;j--){
                int height=temp[j];
                int area=height*width;
                max=Math.max(max,area);
                width++;
            }
        }
        return max;
    }
}