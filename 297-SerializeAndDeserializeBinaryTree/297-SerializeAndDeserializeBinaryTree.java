// Last updated: 04/06/2026, 11:17:00
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)  return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                sb.append("n ");
            }
            else{
                sb.append(curr.val+" ");
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")    return null;
        String[] arr=data.split(" ");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int j=1;
        while(!q.isEmpty() && j<arr.length){
            TreeNode curr=q.poll();
            if(!arr[j].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(arr[j]));
                curr.left=left;
                q.add(left);
            }
            j++;
            if(!arr[j].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(arr[j]));
                curr.right=right;
                q.add(right);
            }
            j++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));