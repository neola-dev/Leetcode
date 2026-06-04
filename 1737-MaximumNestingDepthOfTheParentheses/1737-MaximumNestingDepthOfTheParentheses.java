// Last updated: 04/06/2026, 11:12:18
class Solution {
    public int maxDepth(String s) {
        int size=s.length();
        int cnt=0;
        int max=0;
        for(int i=0;i<size;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }
            if(s.charAt(i)==')'){
                cnt--;
            }
            max=Math.max(max,cnt);
        }
        return max;
    }
}