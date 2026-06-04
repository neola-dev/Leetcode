// Last updated: 04/06/2026, 11:13:34
class Solution {
    public static int calculate(int[] arr,int cap){
        int load=0;
        int day=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                day+=1;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max;
        int high=(int)sum;
        while(low<=high){
            int mid=(low+high)/2;
            int calcdays=calculate(weights,mid);
            if(calcdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        } 
        return low;
    }
}