// Last updated: 04/06/2026, 11:11:37
class Solution {
    public boolean checkString(String s) {
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='b' && s.charAt(i+1)=='a')   return false;
        }
        return true;
    }
}