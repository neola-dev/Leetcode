// Last updated: 27/06/2026, 12:45:20
1class Solution {
2    public void recur(String s,int ind,List<String> res,int n,StringBuilder sb,int parts){
3        if(parts==4){
4            if(ind==n){
5                res.add(sb.toString());
6            }
7            return;
8        }
9        for(int len=1;len<=3;len++){
10            if(ind+len>n)   break;
11            String sub=s.substring(ind,ind+len);
12            if(sub.length()>1 && sub.charAt(0)=='0') break;
13            int num=Integer.parseInt(sub);
14            if(num>255){
15                break;
16            }
17            int size=sb.length();
18            if(parts>0) sb.append('.'); 
19            sb.append(sub);
20            recur(s,ind+len,res,n,sb,parts+1);
21            sb.setLength(size);
22        }
23    }
24    public List<String> restoreIpAddresses(String s) {
25        List<String> res=new ArrayList<>();
26        int n=s.length();
27        recur(s,0,res,n,new StringBuilder(),0);
28        return res;
29    }
30}