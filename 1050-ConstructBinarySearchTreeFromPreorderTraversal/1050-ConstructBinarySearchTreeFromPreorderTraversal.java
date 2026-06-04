// Last updated: 04/06/2026, 11:13:36
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
    int indx=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder,Integer.MAX_VALUE);
    }
    public TreeNode build(int[] preorder,int upperbound){
        if(indx==preorder.length || preorder[indx]>upperbound){
            return null;
        }
        TreeNode root=new TreeNode(preorder[indx++]);
        root.left=build(preorder,root.val);
        root.right=build(preorder,upperbound);
        return root;
    }
}