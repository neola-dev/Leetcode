// Last updated: 04/06/2026, 11:17:40
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
    //tc O(log N^2) & sc O(log N)
    public int bfs(TreeNode root){
        if(root==null)  return 0;
        int leftHeight=findLeftHeight(root);
        int rightHeight=findRightHeight(root);
        if(leftHeight==rightHeight)     return (1<<leftHeight)-1;
        return 1+bfs(root.left)+bfs(root.right);
    }
    public int findLeftHeight(TreeNode root){
        int cnt=0;
        while(root!=null){
            cnt++;
            root=root.left;
        }
        return cnt;
    }
    public int findRightHeight(TreeNode root){
        int cnt=0;
        while(root!=null){
            cnt++;
            root=root.right;
        }
        return cnt;
    }
    public int countNodes(TreeNode root) {
        if(root==null)  return 0;
        return bfs(root);
    }
}