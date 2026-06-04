// Last updated: 04/06/2026, 11:19:02
class Solution {
    public int minimumTotal(List<List<Integer>> triangle){
        int n=triangle.size();
        int[] dp=new int[n];
        for(int j=0;j<triangle.get(n-1).size();j++){
            dp[j]=triangle.get(n-1).get(j);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int down=dp[j];
                int dia=dp[j+1];
                dp[j]=triangle.get(i).get(j)+Math.min(down,dia);
            }
        }
        return dp[0];
    }
}