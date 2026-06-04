// Last updated: 04/06/2026, 11:15:35
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
    public int find(TreeNode root,int[] dia){
        if(root==null)  return 0;
        int[] left=new int[1];
        left[0]=find(root.left,dia);
        int[] right=new int[1];
        right[0]=find(root.right,dia);
        dia[0]=Math.max(dia[0],left[0]+right[0]);
        return 1+Math.max(left[0],right[0]);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dia=new int[1];
        find(root,dia);
        return dia[0];
    }
}