// Last updated: 04/06/2026, 11:12:27
class Solution {
    public static boolean possible(int[] arr,int m,int k,int mid){
        int count=0;
        int bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                bouquets+=count/k;
                count=0;
            }
        }
        bouquets+=count/k;
        if(bouquets>=m){
            return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
         if((long)m*k>n){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }
        int low=min;
        int high=max;
    
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,m,k,mid)==true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}