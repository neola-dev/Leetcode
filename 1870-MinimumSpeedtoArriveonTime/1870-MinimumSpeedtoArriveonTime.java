// Last updated: 17/08/2026, 14:49:37
1class Solution {
2    public int minSpeedOnTime(int[] dist, double hour) {
3        int min=Integer.MAX_VALUE;
4        int n=dist.length;
5        int sum=0;
6        for(int i=0;i<n;i++){
7            min=Math.min(min,dist[i]);
8            sum+=dist[i];
9        }
10        int low=1;
11        int high=10_000_000;
12        while(low<=high){
13            int mid=(low+high)/2;
14            if(isPossible(mid,hour,dist)){
15                high=mid-1;
16            }
17            else{
18                low=mid+1;
19            }
20        }
21        return low>10_000_000?-1:low;
22    }
23    public boolean isPossible(int mid,double hour,int[] dist){
24        double req=0;
25        for(int i=0;i<dist.length-1;i++){
26            req+=Math.ceil((double)dist[i]/mid);
27        }
28        req+=(double)dist[dist.length-1]/mid;
29        return req<=hour;
30    }
31}