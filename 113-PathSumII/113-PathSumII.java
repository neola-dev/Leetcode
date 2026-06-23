// Last updated: 23/06/2026, 22:56:57
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
17    List<List<Integer>> res=new ArrayList<>();
18    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
19        int sum=0;
20        dfs(root,sum,targetSum,new ArrayList<>());
21        return res;
22    }
23    public void dfs(TreeNode root,int sum,int targetSum,ArrayList<Integer> path){
24        if(root==null){
25            return;
26        }
27        sum+=root.val;
28        path.add(root.val);
29        if(root.left==null && root.right==null){
30            if(sum==targetSum){
31                res.add(new ArrayList<>(path));
32            }
33        }
34        dfs(root.left,sum,targetSum,path);
35        dfs(root.right,sum,targetSum,path);
36        path.remove(path.size()-1);
37    }
38}