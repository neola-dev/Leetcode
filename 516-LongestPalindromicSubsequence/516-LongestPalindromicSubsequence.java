// Last updated: 11/08/2026, 14:27:47
1class Solution {
2    public int[] findPse(int[] arr){
3        int n=arr.length;
4        int[] pse=new int[n];
5        Stack<Integer> st=new Stack<>();
6        for(int i=0;i<n;i++){
7            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
8                st.pop();
9            }
10            pse[i]=st.isEmpty()?-1:st.peek();
11            st.push(i);
12        }
13        return pse;
14    }
15    public int[] findNse(int[] arr){
16        int n=arr.length;
17        int[] nse=new int[n];
18        Stack<Integer> st=new Stack<>();
19        for(int i=n-1;i>=0;i--){
20            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
21                st.pop();
22            }
23            nse[i]=st.isEmpty()?n:st.peek();
24            st.push(i);
25        }
26        return nse;
27    }
28    public int sumSubarrayMins(int[] arr) {
29        int n=arr.length;
30        int[] pse=findPse(arr);
31        int[] nse=findNse(arr);
32        int mod=1000000007;
33        long tot=0;
34        for(int i=0;i<n;i++){
35            int prev=i-pse[i];
36            int next=nse[i]-i;
37            tot=(tot+1L*arr[i]*prev*next)%mod;
38        }
39        return (int)tot;
40    }
41}