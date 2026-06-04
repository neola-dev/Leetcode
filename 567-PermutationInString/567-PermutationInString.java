// Last updated: 04/06/2026, 11:15:26
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            freq[ch-'a']++;
        }
        int l=0,r=0;
        int cnt=s1.length();
        while(r<s2.length()){
            char chR=s2.charAt(r);
            if(freq[chR-'a']>0){
                cnt--;
            }
            freq[chR-'a']--;
            r++;
            if(r-l==s1.length()){
                char chL=s2.charAt(l);
                if(cnt==0)  return true;
                if(freq[chL-'a']>=0){
                    cnt++;
                }
                freq[chL-'a']++;
                l++;
            }
        }
        return false;
    }
}