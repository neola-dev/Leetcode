// Last updated: 09/06/2026, 11:29:07
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int[] freq=new int[26];
4        for(int i=0;i<s1.length();i++){
5            char ch=s1.charAt(i);
6            freq[ch-'a']++;
7        }
8        int l=0,r=0;
9        int cnt=s1.length();
10        while(r<s2.length()){
11            char chR=s2.charAt(r);
12            if(freq[chR-'a']>0){
13                cnt--;
14            }
15            freq[chR-'a']--;
16            r++;
17            if(r-l==s1.length()){
18                char chL=s2.charAt(l);
19                if(cnt==0)  return true;
20                if(freq[chL-'a']>=0){
21                    cnt++;
22                }
23                freq[chL-'a']++;
24                l++;
25            }
26        }
27        return false;
28    }
29}