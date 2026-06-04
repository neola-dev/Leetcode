// Last updated: 04/06/2026, 11:19:18
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
    int pi=0; //to access preorder since recursion doesn't go linear
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i); //put all elmts with ind in map since inorder has its order left->root->right we can find the elmt of preorder index and traverse
        }
        return dfs(preorder,0,inorder.length-1);
    }
    public TreeNode dfs(int[] preorder,int st,int end){
        if(st>end)  return null;
        int elmt=preorder[pi++];
        int mid=map.get(elmt);
        TreeNode root=new TreeNode(elmt);
        root.left=dfs(preorder,st,mid-1);
        root.right=dfs(preorder,mid+1,end);
        return root;
    }
}