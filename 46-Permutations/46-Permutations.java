// Last updated: 27/06/2026, 12:01:30
1class Solution {
2    public void recur(int ind,String s,List<String> res,int n,StringBuilder sb){
3        if(sb.length()==n){
4            res.add(sb.toString());
5            return;
6        }
7        char ch=s.charAt(ind);
8        boolean isDig=(int)ch>=48 && (int)ch<=57;
9        if(isDig){
10            sb.append(ch);
11            recur(ind+1,s,res,n,sb);
12            sb.deleteCharAt(sb.length()-1);
13        }
14        else{
15            sb.append(Character.toLowerCase(ch));
16            recur(ind+1,s,res,n,sb);
17            sb.deleteCharAt(sb.length()-1);
18            sb.append(Character.toUpperCase(ch));
19            recur(ind+1,s,res,n,sb);
20            sb.deleteCharAt(sb.length()-1);
21        }
22    }
23    public List<String> letterCasePermutation(String s) {
24        List<String> res=new ArrayList<>();
25        int n=s.length();
26        recur(0,s,res,n,new StringBuilder());
27        return res;
28    }
29}