// Last updated: 02/10/2026, 21:02:41
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        int n=g.length;
4        int m=s.length;
5        Arrays.sort(g);
6        Arrays.sort(s);
7        int i=0;
8        int j=0;
9        int cnt=0;
10        while(i<n && j<m){
11            if(s[j]>=g[i]){
12                i++;
13            }
14            j++;
15        }
16        return i;
17
18    }
19}