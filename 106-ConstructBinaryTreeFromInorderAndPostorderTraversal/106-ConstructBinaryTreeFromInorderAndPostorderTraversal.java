// Last updated: 04/06/2026, 11:19:17
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
    HashMap<Integer,Integer> map;
    int pi;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        pi=postorder.length-1;
        return dfs(postorder,0,inorder.length-1);
    }
    public TreeNode dfs(int[] postorder,int st,int end){
        if(st>end)  return null;
        int elmt=postorder[pi--];
        int mid=map.get(elmt);
        TreeNode root=new TreeNode(elmt);
        root.right=dfs(postorder,mid+1,end);
        root.left=dfs(postorder,st,mid-1);
        return root;
    }
}