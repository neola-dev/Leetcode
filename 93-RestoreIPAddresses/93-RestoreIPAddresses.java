// Last updated: 31/08/2026, 09:00:55
1class Solution {
2    public void recur(String s,int ind,List<String> res,int n,StringBuilder sb,int parts){
3        if(parts==4){
4            if(ind==n) res.add(sb.toString());
5            return;
6        }
7        for(int len=1;len<=3;len++){
8            if(ind+len>n) break;
9            String sub=s.substring(ind,ind+len);
10            if(sub.length()>1 && sub.charAt(0)=='0') break;
11            int num=Integer.parseInt(sub);
12            if(num>255) break;
13            int size=sb.length();
14            if(parts>0) sb.append('.');
15            sb.append(sub);
16            recur(s,ind+len,res,n,sb,parts+1);
17            sb.setLength(size);
18        }
19    }
20    public List<String> restoreIpAddresses(String s) {
21        List<String> res=new ArrayList<>();
22        int n=s.length();
23        recur(s,0,res,n,new StringBuilder(),0);
24        return res;  
25    }
26}