// Last updated: 23/06/2026, 11:21:37
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
17    public int widthOfBinaryTree(TreeNode root) {
18        if(root==null)  return 0;
19        Queue<Pair<TreeNode,Long>> q=new LinkedList<>();
20        q.add(new Pair<>(root,0L));
21        int ans=0;
22        while(!q.isEmpty()){
23            int size=q.size();
24            long min=q.peek().getValue();
25            long first=0L,last=0L;
26            for(int i=0;i<size;i++){
27                Pair<TreeNode,Long> p=q.poll();
28                TreeNode curr=p.getKey();
29                long indx=p.getValue()-min;
30                if(i==0)    first=indx;
31                if(i==size-1)   last=indx;
32                if(curr.left!=null){
33                    q.add(new Pair<>(curr.left,2*indx+1));
34                }
35                if(curr.right!=null){
36                    q.add(new Pair<>(curr.right,2*indx+2));
37                }
38            }
39            ans=Math.max(ans,(int)(last-first+1));
40        }
41        return ans;
42    }
43}