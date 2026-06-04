// Last updated: 04/06/2026, 11:17:16
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        List<String> ls=new ArrayList<>();
        dfs(root,res,ls);
        return res;
    }
    public void dfs(TreeNode root,List<String> res,List<String> ls){
        if(root==null){
            return;
        }
        ls.add(String.valueOf(root.val));
        if(root.left==null && root.right==null){
            String str=String.join("->",ls);
            res.add(str);
        }
        else{ 
            dfs(root.left,res,ls);
            dfs(root.right,res,ls);
        }
        ls.remove(ls.size()-1);    
    } 
}