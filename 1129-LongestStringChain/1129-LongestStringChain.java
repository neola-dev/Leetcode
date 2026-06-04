// Last updated: 04/06/2026, 11:13:23
class Solution {
    public boolean compare(String word1,String word2){
        int i=0;
        int j=0;
        while(i<word1.length()){
            if(j < word2.length() && word1.charAt(i)==word2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return i==word1.length() && j==word2.length();
    }
    public int longestStrChain(String[] words) {
        int n=words.length;
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(words[prev].length()+1==words[i].length()){
                    if(compare(words[i],words[prev]) && dp[prev]+1>dp[i]){
                        dp[i]=dp[prev]+1;
                    }
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}