// Last updated: 11/06/2026, 11:14:02
1class Solution {
2    public String simplifyPath(String path) {
3        String[] arr=path.split("/");
4        Stack<String> st=new Stack<>();
5        for(String str:arr){
6            if(str.equals("..")){
7                if(!st.isEmpty()) st.pop();
8            }
9            else if(str.equals("")){
10                continue;
11            }
12            else if(str.equals(".")){
13                continue;
14            }
15            else{
16                st.push(str);
17            }
18        }
19        StringBuilder sb=new StringBuilder();
20        for(String dir:st){
21            sb.append("/");
22            sb.append(dir);
23        }
24        if(sb.length()==0)  return "/";
25        return sb.toString();
26    }
27}