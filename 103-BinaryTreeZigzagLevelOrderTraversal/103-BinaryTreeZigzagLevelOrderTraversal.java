// Last updated: 04/06/2026, 11:19:21
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null)  return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=true;
        while(!q.isEmpty()){
            int size=q.size();
            Integer[] arr=new Integer[size];
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                int ind=leftToRight?i:size-i-1;
                arr[ind]=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null)    q.add(curr.right);
            }
            leftToRight=!leftToRight;
            res.add(Arrays.asList(arr));
        }
        return res;
    }
}