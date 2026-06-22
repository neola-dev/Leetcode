// Last updated: 22/06/2026, 20:51:24
1class Solution {
2    public void helper(int open,int closed,int n,List<String> res,StringBuilder sb){
3        if(open==n && closed==n){
4            res.add(sb.toString());
5            return;
6        }
7        
8        if(open<n){
9            sb.append("(");
10            helper(open+1,closed,n,res,sb);
11            sb.deleteCharAt(sb.length()-1);
12        }
13        if(closed<open){
14            sb.append(")");
15            helper(open,closed+1,n,res,sb);
16            sb.deleteCharAt(sb.length()-1);
17        }
18    }
19    public List<String> generateParenthesis(int n) {
20        List<String> res=new ArrayList<>();
21        helper(0,0,n,res,new StringBuilder());
22        return res;
23    }
24}