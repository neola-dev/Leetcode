// Last updated: 23/06/2026, 23:18:13
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
17    int maxSum=Integer.MIN_VALUE;
18    public int dfs(TreeNode root){
19        if(root==null)  return 0;
20        int left=Math.max(0,dfs(root.left));
21        int right=Math.max(0,dfs(root.right));
22        maxSum=Math.max(maxSum,left+right+root.val);
23        return Math.max(left,right)+root.val;
24    }
25    public int maxPathSum(TreeNode root) {
26        if(root==null)  return 0;
27        dfs(root);
28        return maxSum;
29    }
30}