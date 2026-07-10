// Last updated: 10/07/2026, 18:05:55
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        if(s.length()==1 && s.charAt(0)=='-') return "";
4        String[] arr=s.split("-");
5        String str="";
6        for(String a:arr) str+=a;
7        int len=str.length();
8        char[] chArr=str.toCharArray();
9        StringBuilder res=new StringBuilder();
10        StringBuilder sub=new StringBuilder();
11        System.out.print(str);
12        int cnt=0;
13        if(len%k==0){
14            for(char ch:chArr){
15                cnt++;
16                sub.append(ch);
17                if(cnt==k){
18                    sub.append('-');
19                    res.append(sub);
20                    //System.out.print(res);
21                    sub=new StringBuilder();
22                    cnt=0;
23                }
24            }
25        }
26        else{
27            for(int i=chArr.length-1;i>=0;i--){
28                cnt++;
29                sub.append(chArr[i]);
30                //System.out.print(chArr[i]);
31                if(cnt==k){
32                    sub.append('-');
33                    res.append(sub);
34                    sub=new StringBuilder();
35                    cnt=0;
36                }   
37            }
38            res.append(sub);
39        }
40        if(res.length()==0) return "";
41        if(len%k==0){
42            res.deleteCharAt(res.length()-1);
43            return res.toString().toUpperCase();
44        }
45        return res.reverse().toString().toUpperCase();
46    }
47}