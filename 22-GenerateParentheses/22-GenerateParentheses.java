// Last updated: 04/06/2026, 11:20:51
class Solution {
    public void helper(int open,int closed,int n,List<String> res,StringBuilder sb){
        if(open==n && closed==n){
            res.add(sb.toString());
            return;
        }
        
        if(open<n){
            sb.append("(");
            helper(open+1,closed,n,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(closed<open){
            sb.append(")");
            helper(open,closed+1,n,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(0,0,n,res,new StringBuilder());
        return res;
    }
}