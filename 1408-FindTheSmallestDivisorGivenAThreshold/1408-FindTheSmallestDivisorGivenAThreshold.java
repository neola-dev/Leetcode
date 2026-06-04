// Last updated: 04/06/2026, 11:12:56
class Solution {
    public static int findsum(int[] arr, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (int)Math.ceil((double)arr[i] / mid);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = findsum(nums, mid);
            if (res <= threshold) {
                ans = mid;
                high = mid - 1;  // try to minimize further
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
