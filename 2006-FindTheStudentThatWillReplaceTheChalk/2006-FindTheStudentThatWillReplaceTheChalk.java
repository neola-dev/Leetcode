// Last updated: 04/06/2026, 11:11:54
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;

        // Step 1: calculate total chalk for one round
        for (int c : chalk) {
            total += c;
        }

        // Step 2: reduce k using modulo
        k = (int)(k % total);

        // Step 3: find the student who can't be satisfied
        for (int i = 0; i < chalk.length; i++) {
            if (chalk[i] > k) {
                return i;
            }
            k -= chalk[i];
        }

        return -1; // never reached
    }
}
