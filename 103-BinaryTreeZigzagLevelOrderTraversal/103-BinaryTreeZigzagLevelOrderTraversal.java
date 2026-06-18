// Last updated: 18/06/2026, 12:06:43
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> res=new ArrayList<>();
19        if(root==null)  return res;
20        Queue<TreeNode> q=new LinkedList<>();
21        q.add(root);
22        boolean leftToRight=false;
23        while(!q.isEmpty()){
24            int size=q.size();
25            Integer[] arr=new Integer[size];
26            for(int i=0;i<size;i++){
27                TreeNode curr=q.poll();
28                int ind=leftToRight?size-i-1:i;
29                arr[ind]=curr.val;
30                if(curr.left!=null){
31                    q.add(curr.left);
32                }
33                if(curr.right!=null){
34                    q.add(curr.right);
35                }
36            }
37            leftToRight=!leftToRight;
38            res.add(Arrays.asList(arr));
39        }
40        return res;
41    }
42}