// Last updated: 17/08/2026, 19:58:56
1class Solution {
2    public long repairCars(int[] ranks, int cars) {
3        long low=1;
4        int minRank=Integer.MAX_VALUE;
5        for(int rank:ranks){
6            minRank=Math.min(minRank,rank);
7        }
8        long high=(long)minRank*cars*cars;
9        long ans=0;
10        while(low<=high){
11            long mid=(low+high)/2;
12            if(isPossible(mid,ranks,cars)){
13                ans=mid;
14                high=mid-1;
15            }
16            else{
17                low=mid+1;
18            }
19        }
20        return ans;
21    }
22    public boolean isPossible(long mid,int[] ranks,int cars){
23        long cnt=0;
24        for(int rank:ranks){
25            cnt+=Math.sqrt(mid/rank);
26        }
27        return cnt>=cars;
28    }
29}