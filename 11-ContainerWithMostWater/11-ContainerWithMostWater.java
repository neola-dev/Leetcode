// Last updated: 09/06/2026, 16:42:37
1class Solution {
2    public String minWindow(String s, String t) {
3        if(s.length()<t.length())   return "";
4        int[] need=new int[256];
5        int req=0;
6        for(int i=0;i<t.length();i++){
7            if(need[t.charAt(i)]==0)  req++;
8            need[t.charAt(i)]++;
9        } 
10        int formed=0;
11        int[] have=new int[256];
12        int l=0,r=0,min=Integer.MAX_VALUE;
13        int start=-1;
14        while(r<s.length()){
15            char ch=s.charAt(r);
16            have[ch]++;
17            if(need[ch]>0 && need[ch]==have[ch]){
18                formed++;
19            }
20            while(formed==req){
21                if(r-l+1<min){
22                    min=r-l+1;
23                    start=l;
24                }
25                char chL=s.charAt(l);
26                have[chL]--;
27                if(need[chL]>0 && have[chL]<need[chL]){
28                    formed--;
29                }
30                l++;
31            }
32            r++;
33        }
34        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
35    }
36}