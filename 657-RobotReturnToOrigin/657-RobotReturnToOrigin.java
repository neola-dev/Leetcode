// Last updated: 04/06/2026, 11:15:04
class Solution {
    public static boolean judgeCircle(String moves) {
        if (moves.length() % 2 == 1) return false;
        int[] freq = new int[26];
        for (char c: moves.toCharArray()) freq[c - 'A']++;
        return freq['D' - 'A'] == freq['U' - 'A'] && freq['L' - 'A'] == freq['R' - 'A'];
    }
}