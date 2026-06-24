// Last updated: 24/06/2026, 10:28:18
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
17    int pi=0;
18    HashMap<Integer,Integer> map;
19    public TreeNode buildTree(int[] preorder, int[] inorder) {
20        map=new HashMap<>();
21        for(int i=0;i<inorder.length;i++){
22            map.put(inorder[i],i);
23        }
24        return construct(preorder,0,inorder.length-1);
25    }
26    public TreeNode construct(int[] preorder,int st,int end){
27        if(st>end)  return null;
28        int elmt=preorder[pi++];
29        int mid=map.get(elmt);
30        TreeNode root=new TreeNode(elmt);
31        root.left=construct(preorder,st,mid-1);
32        root.right=construct(preorder,mid+1,end);
33        return root;
34    }
35}