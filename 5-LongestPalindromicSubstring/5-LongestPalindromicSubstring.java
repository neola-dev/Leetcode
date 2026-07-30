// Last updated: 30/07/2026, 22:48:07
1class Solution {
2    public String expandAroundCenter(String s,int i,int j){
3        while(i>=0 && j<s.length()){
4            if(s.charAt(i)==s.charAt(j)){
5                i--;
6                j++;
7            }
8            else{
9                break;
10            }
11        }
12        return s.substring(i+1,j);
13    }
14    public String longestPalindrome(String s) {
15        String longest="";
16        for(int i=0;i<s.length();i++){
17            String odd=expandAroundCenter(s,i,i);
18            if(odd.length()>longest.length()) longest=odd;
19            String even=expandAroundCenter(s,i,i+1);
20            if(even.length()>longest.length()) longest=even;
21        }
22        return longest;
23    }
24}