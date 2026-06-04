// Last updated: 04/06/2026, 11:12:47
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int cnt=0;
        if(sum/k>=threshold)    cnt++;
        for(int i=1;i<n-k+1;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            if(sum/k>=threshold){
                cnt++;
            }
        }
        return cnt;
    }
}