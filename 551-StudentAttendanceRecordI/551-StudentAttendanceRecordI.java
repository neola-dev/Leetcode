// Last updated: 04/06/2026, 11:15:33
class Solution {
    public boolean checkRecord(String s) {
       int conslcnt=0;
       int acnt=0;
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(i>0 && ch=='L' && s.charAt(i-1)=='L'){
                conslcnt++;
                if(conslcnt>=3){
                    break;
                }
            }
            else if(ch=='L'){
                conslcnt=1;
            }
            if(ch=='A'){
                acnt++;
                if(acnt>=2)     break;
            }
       }   
       if(conslcnt<3 && acnt<2){
            return true;
       }
       return false;
    }
}