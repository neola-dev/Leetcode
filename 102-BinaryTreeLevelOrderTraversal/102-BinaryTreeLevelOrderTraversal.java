// Last updated: 18/06/2026, 12:27:23
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
17    public List<List<Integer>> levelOrderBottom(TreeNode root) {
18        List<List<Integer>> res=new ArrayList<>();
19        if(root==null)  return res;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.add(root);
22        while(!q.isEmpty()){
23            int size=q.size();
24            List<Integer> sub=new ArrayList<>();
25            for(int i=0;i<size;i++){
26                TreeNode curr=q.poll();
27                sub.add(curr.val);
28                if(curr.left!=null) q.add(curr.left);
29                if(curr.right!=null)    q.add(curr.right);
30            }
31            res.addFirst(sub);
32        }
33        return res;
34    }
35}