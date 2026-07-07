// Last updated: 07/07/2026, 11:20:08
1class Solution {
2    public int hIndex(int[] citations) {
3        Arrays.sort(citations);
4        int n=citations.length;
5        for(int i=0;i<n;i++){
6            int h=n-i;
7            if(citations[i]>=h) return h;
8        }
9        return 0;
10    }
11}