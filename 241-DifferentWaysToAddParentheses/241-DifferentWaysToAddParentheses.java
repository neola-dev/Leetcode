// Last updated: 04/06/2026, 11:17:19
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        HashMap<String,List<Integer>> map=new HashMap<>();
        return solve(expression,map);
    }
    public List<Integer> solve(String expr,HashMap<String,List<Integer>> map){
        if(map.containsKey(expr)){
            return map.get(expr);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<expr.length();i++){
            char ch=expr.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                String left=expr.substring(0,i);
                String right=expr.substring(i+1);
                List<Integer> leftPart=solve(left,map);
                List<Integer> rightPart=solve(right,map);
                for(int l:leftPart){
                    for(int r:rightPart){
                        if(ch=='+') res.add(l+r);
                        else if(ch=='-')    res.add(l-r);
                        else    res.add(l*r);
                    }
                }
            }
        }
        if(res.size()==0)   res.add(Integer.parseInt(expr));
        map.put(expr,res);
        return res;
    }
}