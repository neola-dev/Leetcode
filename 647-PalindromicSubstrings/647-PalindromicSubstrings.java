// Last updated: 04/06/2026, 11:15:07
class Solution {
    public boolean isPalind(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int cnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            int st = i, end = i;
            while (st >= 0 && end < n && isPalind(s, st, end)) {
                cnt++;
                st--;
                end++;
            }
            st = i;
            end = i + 1;
            while (st >= 0 && end < n && isPalind(s, st, end)) {
                cnt++;
                st--;
                end++;
            }
        }
        return cnt;
    }
}