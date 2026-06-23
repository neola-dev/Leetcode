// Last updated: 23/06/2026, 10:15:00
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
17    List<Integer> ans=new ArrayList<>();
18    public List<Integer> rightSideView(TreeNode root) {
19        dfs(0,root);
20        return ans;
21    }
22    public void dfs(int depth,TreeNode root){
23        if(root==null){
24            return;
25        }
26        if(depth==ans.size()){
27            ans.add(root.val);
28        }
29        dfs(depth+1,root.right);
30        dfs(depth+1,root.left);
31    }
32}