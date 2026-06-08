// Last updated: 08/06/2026, 23:32:16
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l=0;
4        int r=0;
5        int maxLen=0;
6        int[] arr=new int[256];
7        Arrays.fill(arr,-1);
8        while(r<s.length()){
9            char ch=s.charAt(r);
10            while(arr[ch]!=-1){
11                char chL=s.charAt(l);
12                l=arr[chL]+1;
13                arr[chL]=-1;
14            }
15            maxLen=Math.max(maxLen,(r-l+1));
16            arr[ch]=r;
17            r++;
18        }
19        return maxLen;
20    }
21}