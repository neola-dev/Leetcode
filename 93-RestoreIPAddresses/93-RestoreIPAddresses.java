// Last updated: 31/08/2026, 10:09:20
1class Solution {
2    public void recur(int ind,String s,List<String> res,HashSet<String> set,StringBuilder sb){
3        if(ind>=s.length()){
4            res.add(sb.toString());
5            return;
6        }
7        for(int i=ind;i<s.length();i++){
8            String part=s.substring(ind,i+1);
9            if(set.contains(part)){
10                int oldSize=sb.length();
11                sb.append(part);
12                if(i!=s.length()-1) sb.append(" ");
13                recur(i+1,s,res,set,sb);
14                sb.setLength(oldSize);
15            }
16        }
17    }
18    public List<String> wordBreak(String s, List<String> wordDict) {
19        List<String> res=new ArrayList<>();
20        HashSet<String> set=new HashSet<>(wordDict);
21        recur(0,s,res,set,new StringBuilder());
22        return res;
23    }
24}