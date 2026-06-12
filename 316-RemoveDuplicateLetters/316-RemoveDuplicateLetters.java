// Last updated: 12/06/2026, 10:57:33
1class Solution {
2    public String removeDuplicateLetters(String s) {
3        int[] freq=new int[26];
4        boolean[] vis=new boolean[26];
5        for(int i=0;i<s.length();i++){
6            char ch=s.charAt(i);
7            freq[ch-'a']++;
8        }
9        Stack<Character> st=new Stack<>();
10        for(char ch:s.toCharArray()){
11            freq[ch-'a']--;
12            if(vis[ch-'a']){
13                continue;
14            }
15            while(!st.isEmpty() && ch<st.peek() && freq[st.peek()-'a']>0){
16                vis[st.pop()-'a']=false;
17            }
18            vis[ch-'a']=true;
19            st.push(ch);
20        }
21        StringBuilder sb=new StringBuilder();
22        for(char ch:st){
23            sb.append(ch);
24        }
25        return sb.toString();
26    }
27}