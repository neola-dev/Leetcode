// Last updated: 04/06/2026, 11:14:26
class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.equals(goal))  return true;
        if(s.length()!=goal.length()){
            return false;
        }
        for(int i=1;i<s.length();i++){
            String pre=s.substring(0,i);
            String suff=s.substring(i,n);
            String comb=suff+pre;
            if(comb.contains(goal))    return true;
        }
        return false;
    }
}