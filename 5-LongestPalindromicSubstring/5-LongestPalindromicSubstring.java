// Last updated: 16/07/2026, 21:45:57
1class Solution {
2    public void recur(int open,int close,List<String> res,StringBuilder sb,int n){
3        if(open==n && close==n){
4            res.add(sb.toString());
5            return;
6        }
7        if(open<n){
8            sb.append("(");
9            recur(open+1,close,res,sb,n);
10            sb.deleteCharAt(sb.length()-1);
11        }
12        if(close<open){
13            sb.append(")");
14            recur(open,close+1,res,sb,n);
15            sb.deleteCharAt(sb.length()-1);
16        }
17    }
18    public List<String> generateParenthesis(int n) {
19        List<String> res=new ArrayList<>();
20        recur(0,0,res,new StringBuilder(),n);
21        return res;
22    }
23}