// Last updated: 04/06/2026, 11:11:34
class Solution {
    public int minimumCost(int[] cost) {
        int minCost=0;
        Arrays.sort(cost);
        int n=cost.length;
        if(cost.length<=2){
            if(cost.length==2)  return cost[0]+cost[1];
            else   return cost[0];
        }
        int i=n-1;
        for(i=n-1;i>=0 && i>=2;i-=3){
            if(Math.min(cost[i],cost[i-1])>=cost[i-2]){
                minCost+=cost[i]+cost[i-1];
            }
        }
        while(i>=0){
            minCost+=cost[i];
            i--;
        }
        return minCost;
    }
}