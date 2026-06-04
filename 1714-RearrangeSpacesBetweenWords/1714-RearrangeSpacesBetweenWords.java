// Last updated: 04/06/2026, 11:12:20
class Solution {
    public String reorderSpaces(String text) {
        int space = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                space++;
            }
        }
        String[] arr = text.trim().split("\\s+");  // FIXED
        int len = arr.length;

        if (len == 1) return arr[0] + " ".repeat(space);

        int total = space / (len - 1);
        int extra=space%(len-1);
        String sp = " ".repeat(total);
        return String.join(sp, arr)+" ".repeat(extra);
    }
}
