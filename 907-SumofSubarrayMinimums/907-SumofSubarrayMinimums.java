// Last updated: 18/06/2026, 11:12:16
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
17    int res=0;
18    public int diameterOfBinaryTree(TreeNode root) {
19        find(root);
20        return res;
21    }
22    public int find(TreeNode root){
23        if(root==null)  return 0;
24        int left=find(root.left);
25        int right=find(root.right);
26        res=Math.max(res,left+right);
27        return 1+Math.max(left,right);
28    }
29}