// Last updated: 03/08/2026, 08:47:41
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
17    int cnt=0;
18    int ans=-1;
19    public int kthSmallest(TreeNode root, int k) {
20        int cnt=1;
21        find(root,k);
22        return ans;
23    }
24    public void find(TreeNode root,int k){
25        if(root==null) return;
26        find(root.left,k);
27        cnt++;
28        if(cnt==k){
29            ans=root.val;
30            return;
31        }
32        find(root.right,k);
33    }
34}