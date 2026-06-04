// Last updated: 04/06/2026, 11:13:57
class Solution {
    public int[] findNse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty())    nse[i]=n;
            else    nse[i]=st.peek();
            st.push(i);
        }
        return nse;
    }
    public int[] findPse(int[] arr){
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty())    pse[i]=-1;
            else    pse[i]=st.peek();
            st.push(i);
        }
        return pse;
    }
    public int sumSubarrayMins(int[] arr) {
        int mod=1000000007;
        int[] nse=findNse(arr);
        int[] pse=findPse(arr);
        long total=0;
        for(int i=0;i<arr.length;i++){
            long nsElmt=nse[i]-i;
            long psElmt=(i-pse[i]);
            total=(total+arr[i]*(nsElmt*psElmt))%mod;
        }
        return (int)total;
    }
}