// Last updated: 04/06/2026, 11:14:07
class Solution {
    public static int checklimit(int[] arr,int hourly){
        double calchours=0;
        for(int i=0;i<arr.length;i++){
            calchours+=Math.ceil((double)arr[i]/hourly);
        }
        return (int)calchours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=java.util.Arrays.stream(piles).max().getAsInt();
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int hourstaken=checklimit(piles,mid);
            if(hourstaken<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}