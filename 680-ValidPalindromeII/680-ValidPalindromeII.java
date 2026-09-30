// Last updated: 30/09/2026, 09:48:41
1class Solution {
2    public boolean isPalin(String s,int l,int r){
3        while(l<r){
4            if(s.charAt(l)!=s.charAt(r)){
5                return false;
6            }
7            l++;
8            r--;
9        }
10        return true;
11    }
12    public boolean validPalindrome(String s) {
13        int n=s.length();
14        int l=0;
15        int r=n-1;
16        while(l<r){
17            char chL=s.charAt(l);
18            char chR=s.charAt(r);
19            if(chL!=chR){
20                return isPalin(s,l+1,r) || isPalin(s,l,r-1);
21            }
22            l++;
23            r--;
24        }
25        return true;
26    }
27}