// Last updated: 04/06/2026, 11:12:13
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}