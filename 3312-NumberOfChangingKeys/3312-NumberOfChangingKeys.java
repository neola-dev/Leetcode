// Last updated: 04/06/2026, 11:10:59
class Solution {
    public int countKeyChanges(String s) {
        int cnt=0;
        for(int i=1;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i-1))!=Character.toLowerCase(s.charAt(i))){
                cnt++;
            }
        }
        return cnt;
    }
}