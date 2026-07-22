// Last updated: 22/07/2026, 09:35:07
1class Solution {
2    public boolean compare(String word1,String word2){
3        int i=0;
4        int j=0;
5        while(i<word1.length()){
6            if(j < word2.length() && word1.charAt(i)==word2.charAt(j)){
7                i++;
8                j++;
9            }
10            else{
11                i++;
12            }
13        }
14        return i==word1.length() && j==word2.length();
15    }
16    public int longestStrChain(String[] words) {
17        Arrays.sort(words,(a,b)->a.length()-b.length());
18        int n=words.length;
19        int[] dp=new int[n];
20        Arrays.fill(dp,1);
21        int max=1;
22        for(int i=0;i<n;i++){
23            for(int prev=0;prev<i;prev++){
24                if(words[prev].length()+1==words[i].length()){
25                    if(compare(words[i],words[prev]) && dp[prev]+1>dp[i]){
26                        dp[i]=dp[prev]+1;
27                    }
28                }
29            }
30            if(dp[i]>max){
31                max=dp[i];
32            }
33        }
34        return max;
35    }
36}