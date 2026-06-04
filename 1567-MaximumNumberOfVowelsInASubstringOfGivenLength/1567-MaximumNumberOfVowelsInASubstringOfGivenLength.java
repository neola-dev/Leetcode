// Last updated: 04/06/2026, 11:12:32
class Solution {
    public int maxVowels(String s, int k) {
        int vowelCnt=0;
        int maxCnt=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u')  vowelCnt++;
            if((r-l+1)==k){
                maxCnt=Math.max(maxCnt,vowelCnt);
                char chL=s.charAt(l);
                if(chL=='a' || chL=='e' || chL=='i'|| chL=='o' || chL=='u')  vowelCnt--;
                l++;
            }
        }
        return maxCnt;
    }
}