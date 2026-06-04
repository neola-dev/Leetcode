// Last updated: 04/06/2026, 11:10:27
class Solution {
    public int countCommas(int n) {
        String numStr=String.valueOf(n);
        if(numStr.length()<4) return 0;
        return (n-1000)+1;
    }
}