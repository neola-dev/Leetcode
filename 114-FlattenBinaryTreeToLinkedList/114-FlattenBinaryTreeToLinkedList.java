// Last updated: 04/06/2026, 11:19:10
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
    //reverse pre-order traversal (right->left->root)
    TreeNode prev=null;
    public void flatten(TreeNode root) {
        if(root==null)  return;
        flatten(root.right); 
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}