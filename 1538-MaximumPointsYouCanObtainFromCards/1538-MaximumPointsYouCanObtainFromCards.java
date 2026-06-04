// Last updated: 04/06/2026, 11:12:37
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0;
        int rightSum=0;
        int max=0;
        for(int i=0;i<k;i++){
            leftSum+=cardPoints[i];
        }
        max=leftSum;
        int rightInd=cardPoints.length-1;
        //Prefix Sum 
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[rightInd];
            max=Math.max(max,leftSum+rightSum);
            rightInd--;
        }
        return max;
    }
}