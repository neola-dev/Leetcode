// Last updated: 28/06/2026, 11:48:34
1class Solution {
2    public void recur(int ind,long curr,String num,long LastOp,int target,StringBuilder sb,List<String> res){
3        if(ind==num.length()){
4            if(curr==target) res.add(sb.toString());
5            return;
6        }
7        for(int len=1;ind+len<=num.length();len++){
8            String sub=num.substring(ind,ind+len);
9            if(sub.length()>1 && sub.charAt(0)=='0')    break;
10            Long value=Long.parseLong(sub);
11            int subLen=sb.length();
12            if(ind==0){
13                sb.append(sub);
14                recur(ind+len,value,num,value,target,sb,res);
15                sb.setLength(subLen);
16            }
17            else{
18                sb.append('+').append(sub);
19                recur(ind+len,curr+value,num,value,target,sb,res);
20                sb.setLength(subLen);
21                sb.append('-').append(sub);
22                recur(ind+len,curr-value,num,-value,target,sb,res);
23                sb.setLength(subLen);
24                sb.append('*').append(sub);
25                recur(ind+len,curr - LastOp + LastOp * value,num,LastOp*value,target,sb,res);
26                sb.setLength(subLen);
27            }
28        }
29    }
30    public List<String> addOperators(String num, int target) {
31        List<String> res=new ArrayList<>();
32        recur(0,0,num,0,target,new StringBuilder(),res);
33        return res;
34    }
35}