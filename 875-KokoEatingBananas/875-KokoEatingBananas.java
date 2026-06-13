// Last updated: 13/06/2026, 23:25:08
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low=1;
4        int high=Integer.MIN_VALUE;
5        for(int i=0;i<piles.length;i++){
6            high=Math.max(high,piles[i]);
7        }
8        while(low<=high){
9            int mid=low+(high-low)/2;
10            long hrs=0;
11            for(int pile:piles){
12                hrs+=(int)Math.ceil((double)pile/mid);
13            }
14            if(hrs<=h){
15                high=mid-1;
16            }
17            else{
18                low=mid+1;
19            }
20        }
21        return low;
22    }
23}