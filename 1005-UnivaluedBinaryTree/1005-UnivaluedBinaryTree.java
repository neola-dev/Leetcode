// Last updated: 04/06/2026, 11:13:48
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
    public boolean isUnivalTree(TreeNode root) {
        return univalued(root,root.val);
    }
    public boolean univalued(TreeNode node,int val){
        if(node==null)  return true;
        if(node.val!=val)   return false;
        return univalued(node.left,val) && univalued(node.right,val);
    }
}