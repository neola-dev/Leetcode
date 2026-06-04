// Last updated: 04/06/2026, 11:18:49
class Solution {
    // public int recur(int i,String s,int[] dp){
    //     if(i==s.length())   return 0;
    //     if(dp[i]!=-1)   return dp[i];
    //     int minCuts=Integer.MAX_VALUE;
    //     for(int ind=i;ind<s.length();ind++){
    //         if(isPalin(i,ind,s)){
    //             int cuts=1+recur(ind+1,s,dp);
    //             minCuts=Math.min(minCuts,cuts);
    //         }
    //     }
    //     return dp[i]=minCuts;
    // }
    public boolean isPalin(int s,int e,String str){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))    return false;
            s++;
            e--;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int minCuts=Integer.MAX_VALUE;
            for(int ind=i;ind<s.length();ind++){
                if(isPalin(i,ind,s)){
                    int cuts=1+dp[ind+1];
                    minCuts=Math.min(minCuts,cuts);
                }
            }
            dp[i]=minCuts;
        }
        return dp[0]-1;
    }
}