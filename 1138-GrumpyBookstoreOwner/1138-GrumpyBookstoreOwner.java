// Last updated: 04/06/2026, 11:13:20
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int l=0;
        int r=0;
        int cust=0,maxGr=0;
        int gr=0;
        while(r<customers.length){
            if(grumpy[r]==0)    cust+=customers[r];
            if(grumpy[r]==1)    gr+=customers[r];
            if((r-l+1)==minutes){
                maxGr=Math.max(maxGr,gr);
                if(grumpy[l]==1)    gr-=customers[l];
                l++;
            }
            r++;
        }
        return cust+maxGr;
    }
}