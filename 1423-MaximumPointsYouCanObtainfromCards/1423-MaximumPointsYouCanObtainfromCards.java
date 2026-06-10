// Last updated: 10/06/2026, 11:33:58
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int leftSum=0;
4        for(int i=0;i<k;i++){
5            leftSum+=cardPoints[i];
6        }
7        int maxSum=leftSum;
8        int n=cardPoints.length;
9        for(int i=0;i<k;i++){
10            leftSum-=cardPoints[k-1-i];
11            leftSum+=cardPoints[n-1-i];
12            maxSum=Math.max(maxSum,leftSum);
13        }
14        return maxSum;
15    }
16}