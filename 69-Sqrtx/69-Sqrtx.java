// Last updated: 04/06/2026, 11:19:52
class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            long square=mid*mid;
            if(square<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}