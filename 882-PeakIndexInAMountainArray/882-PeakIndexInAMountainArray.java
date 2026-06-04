// Last updated: 04/06/2026, 11:14:14
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        /*int peakElmt=arr[0];
        int peakInd=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peakElmt=arr[i];
                peakInd=i;
            }
        }
        return peakInd;*/
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==0 || mid==arr.length-1){
                return mid+1;
            }
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}