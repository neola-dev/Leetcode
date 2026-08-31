// Last updated: 31/08/2026, 11:29:13
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int totGas=0;
4        for(int num:gas) totGas+=num;
5        int totCost=0;
6        for(int num:cost) totCost+=num;
7        if(totGas<totCost) return -1;
8        int currGas=0,startInd=0;
9        for(int i=0;i<gas.length;i++){
10            currGas+=(gas[i]-cost[i]);
11            if(currGas<0){
12                startInd=i+1;
13                currGas=0;
14            }
15        }
16        return startInd;
17    }
18}