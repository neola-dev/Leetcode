// Last updated: 25/07/2026, 09:08:04
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] freq=new int[26];
4        if(s.length()!=t.length()) return false;
5        for(int i=0;i<s.length();i++){
6            freq[s.charAt(i)-'a']++;
7            freq[t.charAt(i)-'a']--;
8        }
9        for(int i=0;i<26;i++){
10            if(freq[i]!=0){
11                return false;
12            }
13        }
14        return true;
15    }
16}