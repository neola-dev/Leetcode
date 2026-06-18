// Last updated: 18/06/2026, 10:35:14
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
17    public boolean isSymmetric(TreeNode root) {
18        if(root==null)  return false;
19        return find(root.left,root.right);
20    }
21    public boolean find(TreeNode p,TreeNode q){
22        if(p==null && q==null)  return true;
23        if(p==null || q==null || p.val!=q.val)  return false;
24        return find(p.left,q.right) && find(p.right,q.left);
25    }
26}