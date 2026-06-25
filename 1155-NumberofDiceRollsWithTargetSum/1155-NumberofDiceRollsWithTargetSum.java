// Last updated: 25/06/2026, 09:48:11
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        while(root!=null){
14            if(p.val<root.val && q.val<root.val){
15                root=root.left;
16            }
17            else if(p.val>root.val && q.val>root.val){
18                root=root.right;
19            }
20            else{
21                return root;
22            }
23        }
24        return null;
25    }
26}