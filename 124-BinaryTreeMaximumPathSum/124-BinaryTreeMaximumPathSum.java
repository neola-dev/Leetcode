// Last updated: 04/06/2026, 11:18:58
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
    int maxSum=Integer.MIN_VALUE;
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftPathMax=Math.max(0,dfs(root.left));
        int rightPathMax=Math.max(0,dfs(root.right));
        maxSum=Math.max(maxSum,leftPathMax+rightPathMax+root.val);
        return Math.max(leftPathMax,rightPathMax)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }
}