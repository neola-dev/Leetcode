// Last updated: 04/06/2026, 11:11:13
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int index=0;
        int maxcnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                cnt+=mat[i][j];
            }
            if(cnt>maxcnt){
                index=i;
                maxcnt=cnt;
            }
        }
        return new int[]{index,maxcnt};
    }
}