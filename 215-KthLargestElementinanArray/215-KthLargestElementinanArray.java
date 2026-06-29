// Last updated: 29/06/2026, 10:57:00
1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[0].length;j++){
6                pq.add(matrix[i][j]);
7                if(pq.size()>k){
8                    pq.poll();
9                }
10            }
11        }
12        return pq.peek();
13    }
14}