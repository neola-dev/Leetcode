// Last updated: 15/06/2026, 17:31:08
1class Solution {
2    public boolean findCanShip(int[] weights,int cap,int days){
3        int day=1;
4        int load=0;
5        for(int wei:weights){
6            if(load+wei>cap){
7                day++;
8                load=wei;
9            }
10            else{
11                load+=wei;
12            }
13        }
14        return day<=days;
15    }
16    public int shipWithinDays(int[] weights, int days) {
17        int max=Integer.MIN_VALUE;
18        int sum=0;
19        for(int wei:weights){
20            max=Math.max(wei,max);
21            sum+=wei;
22        }
23        int l=max;
24        int h=sum;
25        int ans=-1;
26        while(l<=h){
27            int m=l+(h-l)/2;
28            boolean canShip=findCanShip(weights,m,days);
29            if(canShip){
30                ans=m;
31                h=m-1;
32            }
33            else{
34                l=m+1;
35            }
36        }
37        return ans;
38    }
39}