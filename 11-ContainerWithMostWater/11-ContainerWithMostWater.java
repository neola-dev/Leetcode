// Last updated: 09/06/2026, 11:06:53
1class Solution {
2    public int maxVowels(String s, int k) {
3        int vowelCnt=0;
4        int maxCnt=0;
5        int l=0;
6        for(int r=0;r<s.length();r++){
7            char ch=s.charAt(r);
8            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')  vowelCnt++;
9            if((r-l+1)==k){
10                maxCnt=Math.max(maxCnt,vowelCnt);
11                char chL=s.charAt(l);
12                if(chL=='a' || chL=='e' || chL=='i'|| chL=='o' || chL=='u')  vowelCnt--;
13                l++;
14            }
15        }
16        return maxCnt;
17    }
18}