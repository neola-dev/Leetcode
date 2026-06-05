// Last updated: 05/06/2026, 11:15:16
1class Solution {
2    public int equalPairs(int[][] grid) {
3        HashMap<String,Integer> map=new HashMap<>();
4        int n=grid.length;
5        int i=0;
6        while(i<n){
7            String s="";
8            for(int j=0;j<n;j++){
9                s+=String.valueOf(grid[i][j]);
10                s+="*";
11            }
12            map.put(s,map.getOrDefault(s,0)+1);
13            i++;
14        }
15        int result=0;
16        int j=0;
17        while(j<n){
18            String s="";
19            for(int k=0;k<n;k++){
20                s+=String.valueOf(grid[k][j]);
21                s+="*";
22            }
23            if(map.containsKey(s)){
24                result+=map.get(s);
25            }
26            j++;
27        }
28        return result;
29    }
30}