// Last updated: 18/06/2026, 09:46:54
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> inorderTraversal(TreeNode root) {
18        List<Integer> res=new ArrayList<>();
19        dfs(root,res);
20        return res;
21    }
22    public void dfs(TreeNode root,List<Integer> res){
23        if(root==null)  return;
24        dfs(root.left,res);
25        res.add(root.val);
26        dfs(root.right,res);
27    }
28}