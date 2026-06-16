// Last updated: 16/06/2026, 10:04:43
1class Solution {
2    public int findRow(int[][] mat,int mid){
3        int maxElmt=Integer.MIN_VALUE;
4        int maxRowInd=-1;
5        for(int i=0;i<mat.length;i++){
6            if(mat[i][mid]>maxElmt){
7                maxElmt=mat[i][mid];
8                maxRowInd=i;
9            }
10        }
11        return maxRowInd;
12    }
13    public int[] findPeakGrid(int[][] mat) {
14        int n=mat.length;
15        int m=mat[0].length;
16        int low=0,high=m-1;
17        while(low<=high){
18            int mid=low+(high-low)/2;
19            int row=findRow(mat,mid);
20            int left=mid-1>=0?mat[row][mid-1]:-1;
21            int right=mid+1<m?mat[row][mid+1]:-1;
22            if(mat[row][mid]>left && mat[row][mid]>right){
23                return new int[]{row,mid};
24            }
25            else if(mat[row][mid]>left){
26                low=mid+1;
27            }
28            else{
29                high=mid-1;
30            }
31        }
32        return new int[]{-1,-1};
33    }
34}