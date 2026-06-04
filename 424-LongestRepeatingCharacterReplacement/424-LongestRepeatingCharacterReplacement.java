// Last updated: 04/06/2026, 11:16:18
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int l=0,r=0,maxLen=Integer.MIN_VALUE;
        int maxFreq=1;
        while(r<s.length()){
            char chR=s.charAt(r);
            freq[chR-'A']++;
            maxFreq=Math.max(maxFreq,freq[chR-'A']);
            while((r-l+1)-maxFreq>k){
                char chL=s.charAt(l);
                freq[chL-'A']--;
                l++;
            }
            maxLen=Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}