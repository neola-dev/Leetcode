// Last updated: 24/06/2026, 09:57:42
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
17    HashMap<Integer,Integer> map;
18    int pi=0; //to access preorder since recursion doesn't go linear
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        map=new HashMap<>();
21        for(int i=0;i<inorder.length;i++){
22            map.put(inorder[i],i); //put all elmts with ind in map since inorder has its order left->root->right we can find the elmt of preorder index and traverse
23        }
24        return dfs(preorder,0,inorder.length-1);
25    }
26    public TreeNode dfs(int[] preorder,int st,int end){
27        if(st>end)  return null;
28        int elmt=preorder[pi++];
29        int mid=map.get(elmt);
30        TreeNode root=new TreeNode(elmt);
31        root.left=dfs(preorder,st,mid-1);
32        root.right=dfs(preorder,mid+1,end);
33        return root;
34    }
35}