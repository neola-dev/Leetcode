// Last updated: 23/07/2026, 10:13:12
1class Solution {
2    public static void helper(int ind,String s,List<List<String>> res,List<String> sub){
3        if(ind==s.length()){
4            res.add(new ArrayList<>(sub));
5            return;
6        }
7        for(int i=ind;i<s.length();i++){
8            if(isPalin(s,ind,i)){
9                sub.add(s.substring(ind,i+1));
10                helper(i+1,s,res,sub);
11                sub.remove(sub.size()-1);
12            }
13        }
14    }
15    public static boolean isPalin(String str,int st,int end){
16        while(st<=end){
17            if(str.charAt(st)!=str.charAt(end)){
18                return false;
19            }
20            st++;
21            end--;
22        }
23        return true;
24    }
25    public List<List<String>> partition(String s) {
26        List<List<String>> res=new ArrayList<>();
27        List<String> sub=new ArrayList<>();
28        helper(0,s,res,sub);
29        return res;
30    }
31}