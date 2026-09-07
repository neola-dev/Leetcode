// Last updated: 07/09/2026, 15:04:01
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] pre=new int[n];
5        int[] suff=new int[n];
6        int prePrd=1;
7        int suffPrd=1;
8        for(int i=0;i<n;i++){
9            pre[i]=prePrd;
10            suff[n-i-1]=suffPrd;
11            prePrd*=nums[i];
12            suffPrd*=nums[n-i-1];
13        }
14        int[] res=new int[n];
15        for(int i=0;i<n;i++){
16            res[i]=pre[i]*suff[i];
17        }
18        return res;
19    }
20}