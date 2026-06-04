// Last updated: 04/06/2026, 11:12:35
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n = nums.size();
        int total = 0;
        
        for (List<Integer> row : nums) {
            total += row.size();
        }
        
        int[] res = new int[total];
        int idx = 0;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];
            
            res[idx++] = nums.get(r).get(c);
            
            // Move down (start of next diagonal)
            if (c == 0 && r + 1 < n) {
                q.offer(new int[]{r + 1, 0});
            }
            
            // Move right (continue diagonal)
            if (c + 1 < nums.get(r).size()) {
                q.offer(new int[]{r, c + 1});
            }
        }
        
        return res;
    }
}