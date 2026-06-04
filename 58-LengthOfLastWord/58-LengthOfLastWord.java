// Last updated: 04/06/2026, 11:20:04
class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String[] arr=str.split(" ");
        int length=(arr[arr.length-1]).length();
        return length;
    }
}