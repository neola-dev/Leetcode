// Last updated: 16/06/2026, 10:23:58
1class Solution {
2    public int findCntLess(int[][] matrix,int mid,int k){
3        int n=matrix.length;
4        int m=matrix[0].length;
5        int r=n-1;
6        int c=0;
7        int cnt=0;
8        while(r>=0 && c<m){
9            if(matrix[r][c]<=mid){
10                cnt+=r+1;
11                c++;
12            }
13            else{
14                r--;
15            }
16        }
17        return cnt;
18    }
19    public int kthSmallest(int[][] matrix, int k) {
20        int n=matrix.length;
21        int m=matrix[0].length;
22        int l=matrix[0][0];
23        int h=matrix[n-1][m-1];
24        while(l<=h){
25            int mid=l+(h-l)/2;
26            int cnt=findCntLess(matrix,mid,k);
27            if(cnt>=k){
28                h=mid-1;
29            }
30            else{
31               l=mid+1;
32            }
33        }
34        return l; 
35    }
36}