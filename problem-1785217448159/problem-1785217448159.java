// Last updated: 28/07/2026, 11:14:08
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freq=new int[26];
4        int l=0;
5        int r=0;
6        int maxFreq=0;
7        int ans=1;
8        while(r<s.length()){
9            char chR=s.charAt(r);
10            freq[chR-'A']++;
11            maxFreq=Math.max(maxFreq,freq[chR-'A']);
12            if((r-l+1)-maxFreq>k){
13                char chL=s.charAt(l);
14                freq[chL-'A']--;
15                l++;
16            }
17            ans=Math.max(ans,r-l+1);
18            r++;
19        }
20        return ans;
21    }
22}