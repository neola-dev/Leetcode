// Last updated: 03/08/2026, 09:26:13
1class Solution {
2    public String minWindow(String s, String t) {
3        if(s.length()<t.length()) return "";
4        int[] need=new int[256];
5        int req=0;
6        for(int i=0;i<t.length();i++){
7            if(need[t.charAt(i)]==0) req++;
8            need[t.charAt(i)]++;
9        } 
10        int l=0,r=0,min=Integer.MAX_VALUE;
11        int start=-1;
12        int[] have=new int[256];
13        int formed=0;
14        while(r<s.length()){
15            have[s.charAt(r)]++;
16            if(need[s.charAt(r)]>0 && need[s.charAt(r)]==have[s.charAt(r)]){
17                formed++;
18            }
19            while(formed==req){
20                if(r-l+1<min){
21                    min=r-l+1;
22                    start=l;
23                }
24                have[s.charAt(l)]--;
25                if(need[s.charAt(l)]>0 && have[s.charAt(l)]<need[s.charAt(l)]){
26                    formed--;
27                }
28                l++;
29            }
30            r++;
31        }
32        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
33    }
34}