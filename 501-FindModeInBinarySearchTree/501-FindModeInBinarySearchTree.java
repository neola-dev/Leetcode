// Last updated: 04/06/2026, 11:15:52
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    int maxCount = 0;
    int currentCount = 0;
    TreeNode prev = null;
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] modes = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            modes[i] = result.get(i);
        }
        return modes;
    }
    public void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (prev != null && node.val == prev.val) {
            currentCount++;
        } else {
            currentCount = 1;
        }
        if (currentCount > maxCount) {
            result.clear();
            result.add(node.val);
            maxCount = currentCount;
        } else if (currentCount == maxCount) {
            result.add(node.val);
        }
        prev = node;
        inOrder(node.right);
    }
}