// Last updated: 28/06/2026, 11:16:12
1class Solution {
2    public List<Integer> diffWaysToCompute(String expression) {
3        HashMap<String,List<Integer>> map=new HashMap<>();
4        return solve(expression,map);
5    }
6    public List<Integer> solve(String expr,HashMap<String,List<Integer>> map){
7        if(map.containsKey(expr)){
8            return map.get(expr);
9        }
10        List<Integer> res=new ArrayList<>();
11        for(int i=0;i<expr.length();i++){
12            char ch=expr.charAt(i);
13            if(ch=='+' || ch=='-' || ch=='*'){
14                String left=expr.substring(0,i);
15                String right=expr.substring(i+1);
16                List<Integer> leftPart=solve(left,map);
17                List<Integer> rightPart=solve(right,map);
18                for(int l:leftPart){
19                    for(int r:rightPart){
20                        if(ch=='+') res.add(l+r);
21                        else if(ch=='-')    res.add(l-r);
22                        else    res.add(l*r);
23                    }
24                }
25            }
26        }
27        if(res.size()==0)   res.add(Integer.parseInt(expr));
28        map.put(expr,res);
29        return res;
30    }
31}