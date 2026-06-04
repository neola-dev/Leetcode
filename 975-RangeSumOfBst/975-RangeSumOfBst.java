// Last updated: 04/06/2026, 11:13:51
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
    /*Optimised will be based on given bst we can apply some cond where we can actually skip the left or right part if root.val<low skip left part if(root.val>high) skip right part*/ 
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        if(root.val<low){
            return rangeSumBST(root.right,low,high);
        }
        if(root.val>high){
            return rangeSumBST(root.left,low,high);
        }
        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }
}