// Last updated: 04/06/2026, 11:16:07
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        /*char ch=s.charAt(0);
        int endIndx=-1;
        for(int i=1;i<s.length();i++){
            char c=s.charAt(i);
            if(ch==c){
                endIndx=i;
                break;
            }
        }
        if(endIndx==-1){
            return false;
        }
        String sub=s.substring(0,endIndx);
        int x=endIndx;
        for(int i=x;i<s.length();i+=x){
            if(i+x>s.length() || !s.substring(i,i+x).equals(sub)){
                return false;
            }
        }
        return true; 
        for(int  i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);
            }
        }*/
        String doubled=s+s;
        return doubled.substring(1,doubled.length()-1).contains(s);
    }
}