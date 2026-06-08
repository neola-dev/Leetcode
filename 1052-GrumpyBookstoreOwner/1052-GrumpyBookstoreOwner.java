// Last updated: 08/06/2026, 23:43:22
1class Solution {
2    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
3        int l=0;
4        int r=0;
5        int cust=0,maxGr=0;
6        int gr=0;
7        while(r<customers.length){
8            if(grumpy[r]==0)    cust+=customers[r];
9            if(grumpy[r]==1)    gr+=customers[r];
10            if((r-l+1)==minutes){
11                maxGr=Math.max(maxGr,gr);
12                if(grumpy[l]==1)    gr-=customers[l];
13                l++;
14            }
15            r++;
16        }
17        return cust+maxGr;
18    }
19}