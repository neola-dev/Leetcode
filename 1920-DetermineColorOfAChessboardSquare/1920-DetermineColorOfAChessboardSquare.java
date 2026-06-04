// Last updated: 04/06/2026, 11:12:02
class Solution {
    public boolean squareIsWhite(String c) {
        return ((c.charAt(0)+c.charAt(1))%2!=0);
    }
}