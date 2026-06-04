// Last updated: 04/06/2026, 11:16:17
class Solution {
    public int countSegments(String s) {
        if(s.equals("") || s.trim().isEmpty())   return 0;
        s=s.trim();
        String[] arr=s.split("\\s+");
        return arr.length;
    }
}