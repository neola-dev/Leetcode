// Last updated: 04/06/2026, 11:11:45
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int cnt=0;
        int max=Integer.MIN_VALUE;
        int tCnt=0,fCnt=0;
        int l=0,r=0;
        while(r<answerKey.length()){
            if(answerKey.charAt(r)=='T')    tCnt++;
            else    fCnt++;
            while(Math.min(tCnt,fCnt)>k){
                if(answerKey.charAt(l)=='T') tCnt--;
                else    fCnt--;
                l++;
            }
            if((r-l+1)>max)     max=r-l+1;
            r++;
        }
        return max;
    }
}