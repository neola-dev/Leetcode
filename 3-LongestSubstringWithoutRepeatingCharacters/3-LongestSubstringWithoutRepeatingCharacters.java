// Last updated: 04/06/2026, 11:21:14
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int maxLen=0;
        int[] arr=new int[256];
        Arrays.fill(arr,-1);
        while(r<s.length()){
            char ch=s.charAt(r);
            while(arr[ch]!=-1){
                char chL=s.charAt(l);
                l=arr[chL]+1;
                arr[chL]=-1;
            }
            maxLen=Math.max(maxLen,(r-l+1));
            arr[ch]=r;
            r++;
        }
        return maxLen;
    }
}