// Last updated: 04/06/2026, 11:14:10
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root==null){
            return new ArrayList<>();
        }
        Map<TreeNode,TreeNode> parentMap=new HashMap<>();
        mapParents(root,parentMap);
        return bfsFromTarget(target,parentMap,k);
    }
    public void mapParents(TreeNode root,Map<TreeNode,TreeNode> parentMap){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                parentMap.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                parentMap.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
    public  List<Integer> bfsFromTarget(TreeNode target,Map<TreeNode,TreeNode> parentMap,int k){
        Queue<TreeNode> que=new LinkedList<>();
        Set<TreeNode> vis=new HashSet<>();
        que.add(target);
        vis.add(target);
        int dis=0;
        while(!que.isEmpty()){
            int size=que.size();
            if(dis++==k)    break;
            for(int i=0;i<size;i++){
                TreeNode node=que.poll();
                if(node.left!=null && (!vis.contains(node.left))){
                    que.add(node.left);
                    vis.add(node.left);
                }
                if(node.right!=null && (!vis.contains(node.right))){
                    que.add(node.right);
                    vis.add(node.right);
                }
                if(parentMap.containsKey(node) && (!vis.contains(parentMap.get(node)))){
                    que.add(parentMap.get(node));
                    vis.add(parentMap.get(node));
                }
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!que.isEmpty()){
            res.add(que.poll().val);
        }
        return res;
    }
}