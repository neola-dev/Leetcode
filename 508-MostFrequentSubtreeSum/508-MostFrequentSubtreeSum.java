// Last updated: 04/06/2026, 11:15:48
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
    HashMap<Integer,Integer> freq=new HashMap<>();
    int max=Integer.MIN_VALUE;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> ls=new ArrayList<>();
        dfs(root);
        for(int num:freq.keySet()){
            if(freq.get(num)==max){
                ls.add(num);
            }
        }
        int[] res=new int[ls.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ls.get(i);
        }
        return res;
    }
    public int dfs(TreeNode root){
        if(root==null)  return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        int sum=root.val+left+right;
        freq.put(sum,freq.getOrDefault(sum,0)+1);
        max=Math.max(max,freq.get(sum));
        return sum;
    }
}