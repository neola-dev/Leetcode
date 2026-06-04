// Last updated: 04/06/2026, 11:15:03
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Long> indx=new LinkedList<>();
        q.add(root);
        indx.add(0L);
        long ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            long min=indx.peek();
            long first=0,last=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                long ind=indx.poll()-min;
                if(i==0)    first=ind;
                if(i==size-1)   last=ind;
                if(node.left!=null){
                    q.add(node.left);
                    indx.add(2*ind+1);
                }
                if(node.right!=null){
                    q.add(node.right);
                    indx.add(2*ind+2);
                }
            }
            ans=Math.max(ans,(last-first+1));
        }
        return (int)ans;
    }
}