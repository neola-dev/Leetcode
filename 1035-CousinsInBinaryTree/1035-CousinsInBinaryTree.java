// Last updated: 04/06/2026, 11:13:41
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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean cx=false;
            boolean cy=false;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && curr.right!=null){
                    if((curr.left.val==x && curr.right.val==y)||(curr.right.val==x&&curr.left.val==y)){
                        return false;
                    }
                }
                int currVal=curr.val;
                if(currVal==x)  cx=true;
                if(currVal==y)  cy=true;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null)    q.add(curr.right);
            }
            if(cx && cy)    return true;
            if(cx || cy)    return false;
        }
        return false;
    }
}