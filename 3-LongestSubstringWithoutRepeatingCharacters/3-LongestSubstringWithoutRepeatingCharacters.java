// Last updated: 22/06/2026, 20:32:33
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3       int n=s.length();
4       int l=0;
5       int r=0;
6       int maxLen=0;
7       int[] arr=new int[256];
8       Arrays.fill(arr,-1);
9       while(r<n){
10          char chR=s.charAt(r);
11          while(arr[chR]!=-1){
12            char chL=s.charAt(l);
13            l=arr[chL]+1;
14            arr[chL]=-1;
15          }
16          maxLen=Math.max(maxLen,r-l+1);
17          arr[chR]=r;
18          r++;
19       }
20       return maxLen;
21    }
22}