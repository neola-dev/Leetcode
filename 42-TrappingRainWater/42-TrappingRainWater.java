// Last updated: 13/06/2026, 11:56:31
1class Solution {
2    public int[] findNse(int[] arr){
3        int n=arr.length;
4        int[] nse=new int[n];
5        Stack<Integer> st=new Stack<>();
6        for(int i=n-1;i>=0;i--){
7            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
8                st.pop();
9            }
10            if(st.isEmpty())    nse[i]=n;
11            else    nse[i]=st.peek();
12            st.push(i);
13        }
14        return nse;
15    }
16    public int[] findPse(int[] arr){
17        int n=arr.length;
18        int[] pse=new int[n];
19        Stack<Integer> st=new Stack<>();
20        for(int i=0;i<n;i++){
21            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
22                st.pop();
23            }
24            if(st.isEmpty())    pse[i]=-1;
25            else    pse[i]=st.peek();
26            st.push(i);
27        }
28        return pse;
29    }
30    public int sumSubarrayMins(int[] arr) {
31        int mod=1000000007;
32        int[] nse=findNse(arr);
33        int[] pse=findPse(arr);
34        long total=0;
35        for(int i=0;i<arr.length;i++){
36            long nsElmt=nse[i]-i;
37            long psElmt=(i-pse[i]);
38            total=(total+arr[i]*(nsElmt*psElmt))%mod;
39        }
40        return (int)total;
41    }
42}