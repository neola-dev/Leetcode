// Last updated: 09/06/2026, 11:29:53
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int[] freq=new int[26];
4        for(int i=0;i<s1.length();i++){
5            freq[s1.charAt(i)-'a']++;
6        }
7        int cnt=s1.length();
8        int l=0,r=0;
9        while(r<s2.length()){
10            char chR=s2.charAt(r);
11            if(freq[chR-'a']>0){
12                cnt--;
13            }
14            freq[chR-'a']--;
15            if(r-l+1==s1.length()){
16                char chL=s2.charAt(l);
17                if(cnt==0)  return true;
18                if(freq[chL-'a']>=0)    cnt++;
19                freq[chL-'a']++;
20                l++;
21            }
22            r++;
23        }
24        return false;
25    }
26}