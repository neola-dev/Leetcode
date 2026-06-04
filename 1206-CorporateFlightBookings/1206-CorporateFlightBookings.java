// Last updated: 04/06/2026, 11:13:14
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int start,end,x;
        int[] diff=new int[n];
        for(int i=0;i<bookings.length;i++){
            start=bookings[i][0]-1;
            end=bookings[i][1]-1;
            x=bookings[i][2];
            if(start<n) diff[start]+=x;
            if(end+1<n) diff[end+1]-=x;
        }
        int[] ans=new int[n];
        ans[0]=diff[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+diff[i];
        }
        return ans;
        /*int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=ans[i+1];
        }
        return res;*/
    }
}