// Last updated: 15/06/2026, 18:00:33
1class Solution {
2    public boolean canMakeBouquets(int[] bloomDay,int mid,int k,int m){
3        int bouquets=0;
4        int count=0;
5        for(int bloom:bloomDay){
6            if(bloom<=mid){
7                count++;
8            }
9            else{
10                bouquets+=(count/k);
11                count=0;
12            }
13        }
14        bouquets+=(count/k);
15        return bouquets>=m;
16    }
17    public int minDays(int[] bloomDay, int m, int k) {
18        int min=Integer.MAX_VALUE;
19        int max=Integer.MIN_VALUE;
20        if((long)m*k>bloomDay.length)   return -1;
21        for(int bloom:bloomDay){
22            min=Math.min(min,bloom);
23            max=Math.max(max,bloom);
24        }
25        int l=min;
26        int h=max;
27        while(l<=h){
28            int mid=l+(h-l)/2;
29            boolean canMake=canMakeBouquets(bloomDay,mid,k,m);
30            if(canMake){
31                h=mid-1;
32            }
33            else{
34                l=mid+1;
35            }
36        }
37        return l;
38    }
39}