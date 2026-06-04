// Last updated: 04/06/2026, 11:12:14
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];
        for (char c : allowed.toCharArray()) set[c - 'a'] = true;
        int count = 0;
        for (String word : words) {
            boolean consistent = true;
            for (char c : word.toCharArray()) {
                if (!set[c - 'a']) {
                    consistent = false;
                    break;
                }
            }
            if (consistent) count++;
        }
        return count;
    }
}