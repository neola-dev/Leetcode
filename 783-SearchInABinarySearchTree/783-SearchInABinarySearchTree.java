// Last updated: 04/06/2026, 11:14:37
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
    public TreeNode searchBST(TreeNode root, int val) {
        return dfs(root,val);
    }
    public TreeNode dfs(TreeNode root,int val){
        if(root==null)  return null;
        if(root.val==val)   return root;
        if(val<root.val){
            return dfs(root.left,val);
        }
        else{
            return dfs(root.right,val);
        }
    }
}