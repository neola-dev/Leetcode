// Last updated: 09/06/2026, 11:09:41
1class Solution {
2    public int maxVowels(String s, int k) {
3        int n=s.length();
4        int l=0,r=0;
5        int maxLen=0,vowelCnt=0;
6        while(r<n){
7            char ch=s.charAt(r);
8            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
9                vowelCnt++;
10            }
11            if((r-l+1)==k){
12                maxLen=Math.max(maxLen,vowelCnt);
13                char chL=s.charAt(l);
14                if(chL=='a' || chL=='e' || chL=='i' || chL=='o' || chL=='u'){
15                    vowelCnt--;
16                }
17                l++;
18            }
19            r++;
20        }
21        return maxLen;
22    }
23}