// Last updated: 20/08/2026, 14:55:53
1class Solution {
2    public List<Integer> luckyNumbers(int[][] matrix) {
3        List<Integer> ans=new ArrayList<>();
4        int n=matrix.length;
5        int m=matrix[0].length;
6        for(int i=0;i<n;i++){
7            int min=Integer.MAX_VALUE;
8            int minC=-1;
9            for(int j=0;j<m;j++){
10                if(matrix[i][j]<min){
11                    min=Math.min(min,matrix[i][j]);
12                    minC=j;
13                }    
14            }
15            int max=Integer.MIN_VALUE;
16            for(int k=0;k<n;k++){
17                if(matrix[k][minC]>max){
18                    max=matrix[k][minC];
19                }
20            }
21
22            if(min==max){
23                ans.add(min);
24            }
25        }
26        return ans;
27    }
28}