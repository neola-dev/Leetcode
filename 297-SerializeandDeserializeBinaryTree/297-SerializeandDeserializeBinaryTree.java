// Last updated: 19/06/2026, 09:43:47
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11
12    // Encodes a tree to a single string.
13    public String serialize(TreeNode root) {
14        if(root==null)  return "";
15        StringBuilder sb=new StringBuilder();
16        Queue<TreeNode> q=new LinkedList<>();
17        q.add(root);
18        while(!q.isEmpty()){
19            TreeNode curr=q.poll();
20            if(curr==null){
21                sb.append("n ");
22            }
23            else{
24                sb.append(curr.val+" ");
25                q.add(curr.left);
26                q.add(curr.right);
27            }
28        }
29        System.out.print(sb.toString());
30        return sb.toString();
31    }
32
33    // Decodes your encoded data to tree.
34    public TreeNode deserialize(String data) {
35        if(data=="")    return null;
36        String[] arr=data.split(" ");
37        Queue<TreeNode> q=new LinkedList<>();
38        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
39        q.add(root);
40        int j=1;
41        while(!q.isEmpty() && j<arr.length){
42            TreeNode curr=q.poll();
43            if(!arr[j].equals("n")){
44                TreeNode left=new TreeNode(Integer.parseInt(arr[j]));
45                curr.left=left;
46                q.add(left);
47            }
48            j++;
49            if(!arr[j].equals("n")){
50                TreeNode right=new TreeNode(Integer.parseInt(arr[j]));
51                curr.right=right;
52                q.add(right);
53            }
54            j++;
55        }
56        return root;
57    }
58}
59
60// Your Codec object will be instantiated and called as such:
61// Codec ser = new Codec();
62// Codec deser = new Codec();
63// TreeNode ans = deser.deserialize(ser.serialize(root));