// Last updated: 09/06/2026, 12:36:17
1class Solution {
2    public int characterReplacement(String s, int k) {
3       int l=0,r=0;
4       int n=s.length();
5       int[] freq=new int[26];
6       int maxLen=1;
7       int maxFreq=1;
8       while(r<n){
9            char chR=s.charAt(r);
10            freq[chR-'A']++;
11            maxFreq=Math.max(maxFreq,freq[chR-'A']);
12            if((r-l+1)-maxFreq>k){
13                char chL=s.charAt(l);
14                freq[chL-'A']--;
15                l++;
16            }
17            maxLen=Math.max(maxLen,(r-l+1));
18            r++;
19       } 
20       return maxLen;
21    }
22}