// Last updated: 04/06/2026, 11:19:43
class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())   return "";
        int[] need=new int[256];
        int req=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(need[ch]==0) req++;
            need[ch]++;
        }
        int l=0,r=0,start=-1,minLen=Integer.MAX_VALUE;
        int formed=0;
        int[] have=new int[256];
        while(r<s.length()){
            char chR=s.charAt(r);
            have[chR]++;
            if(need[chR]>0 && have[chR]==need[chR]){
                formed++;
            }
            while(formed==req){
                int len=(r-l+1);
                if(len<minLen){
                    minLen=Math.min(minLen,len);
                    start=l;
                }
                char chL=s.charAt(l);
                have[chL]--;
                if(need[chL]>0 && have[chL]<need[chL]){
                    formed--;
                }
                l++;
            }
            r++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}