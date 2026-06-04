// Last updated: 04/06/2026, 11:17:34
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
    int cnt=0;
    int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
        int cnt=1;
        inorder(root,k);
        return ans;
    }
    public void inorder(TreeNode root,int k){
        if(root==null){
            return;
        }
        inorder(root.left,k);
        cnt++;
        if(cnt==k){
            ans=root.val;
            return;
        }
        inorder(root.right,k);
    }
}