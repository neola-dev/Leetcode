// Last updated: 04/06/2026, 11:21:08
class Solution {
    public int myAtoi(String s) {
        StringBuilder res=new StringBuilder();
        s=s.trim();
        boolean signSeen=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 && (ch=='+' || ch=='-') && !signSeen){
                res.append(ch);
                signSeen=true;
            }
            else if(ch>='0' && ch<='9'){
                res.append(ch);
            }
            else{
                break;
            }
        }
        if(res.length()==0 || (res.length()==1 && (res.charAt(0)=='+' || res.charAt(0)=='-')))    return 0;
        int result=0;
        int sign=1;
        if(res.charAt(0)=='-'){
            sign=-1;
        }
        int start=0;
        if(res.charAt(0)=='+' || res.charAt(0)=='-')    start=1;
        for(int i=start;i<res.length();i++){
            int dig=res.charAt(i)-'0';
            if(result > (Integer.MAX_VALUE - dig) / 10){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+dig;
        }
        return sign*result;
    }
}