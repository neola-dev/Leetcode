// Last updated: 04/06/2026, 11:15:40
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
    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE; 
    public int getMinimumDifference(TreeNode root) {
        inorderTraversal(root);
        return min;
    }
    private void inorderTraversal(TreeNode root) {
        if (root == null) return;
        inorderTraversal(root.left);
        if (prev != Integer.MAX_VALUE) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        inorderTraversal(root.right);
    }
}
