// Last updated: 28/07/2026, 12:04:35
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
17    public boolean isValidBST(TreeNode root) {
18       return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
19    }
20    private boolean valid(TreeNode node,long min,long max){
21        if(node==null){
22            return true;
23        }
24        if(!(node.val>min && node.val<max)) return false;
25        return valid(node.left,min,node.val) && valid(node.right,node.val,max);
26    }
27}