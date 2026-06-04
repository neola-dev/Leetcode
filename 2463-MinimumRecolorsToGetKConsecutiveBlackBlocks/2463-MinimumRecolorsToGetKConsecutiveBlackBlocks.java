// Last updated: 04/06/2026, 11:11:24
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int r=0;
        int n=blocks.length();
        int min=Integer.MAX_VALUE;
        int cntW=0;
        while(r<n){
            char chR=blocks.charAt(r);
            if(chR=='W')    cntW++;
            while(r-l+1>k){
                char chL=blocks.charAt(l);
                if(chL=='W') cntW--;
                l++;
            }
            if(r-l+1==k)    min=Math.min(min,cntW);
            r++;
        } 
        return min;
    }
}