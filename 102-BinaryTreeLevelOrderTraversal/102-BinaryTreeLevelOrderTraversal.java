// Last updated: 04/06/2026, 11:19:22
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode cur=q.poll();
                sub.add(cur.val);
                if(cur.left!=null)  q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            res.add(sub);
        }
        return res;
    }
}