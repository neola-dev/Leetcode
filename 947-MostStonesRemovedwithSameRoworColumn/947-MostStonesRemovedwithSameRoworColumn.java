// Last updated: 16/07/2026, 20:36:12
1class DisjointSet{
2    List<Integer> parent=new ArrayList<>();
3    List<Integer> rank=new ArrayList<>();
4    public DisjointSet(int n){
5        for(int i=0;i<n;i++){
6            parent.add(i);
7            rank.add(0);
8        }
9    }
10    public int findUParent(int node){
11        if(node==parent.get(node)){
12            return node;
13        }
14        int ulp=findUParent(parent.get(node));
15        parent.set(node,ulp);
16        return parent.get(node);
17    }
18    public void unionByRank(int u,int v){
19        int ulp_u=findUParent(u);
20        int ulp_v=findUParent(v);
21        if(ulp_u==ulp_v)    return;
22        if(rank.get(ulp_u)<rank.get(ulp_v)){
23            parent.set(ulp_u,ulp_v);
24        }
25        else if(rank.get(ulp_v)<rank.get(ulp_u)){
26            parent.set(ulp_v,ulp_u);
27        }
28        else{
29            parent.set(ulp_v,ulp_u);
30            int rankU=rank.get(ulp_u);
31            rank.set(ulp_u,rankU+1);
32        }
33    }
34}
35class Solution {
36    public int removeStones(int[][] stones) {
37        int maxRow=0;
38        int maxCol=0;
39        for(int[] each:stones){
40            maxRow=Math.max(maxRow,each[0]);
41            maxCol=Math.max(maxCol,each[1]);
42        }
43        DisjointSet ds=new DisjointSet(maxRow+maxCol+2);
44        HashMap<Integer,Integer> map=new HashMap<>();
45        for(int[] each:stones){
46            int nodeRow=each[0];
47            int nodeCol=each[1]+maxRow+1;
48            ds.unionByRank(nodeRow,nodeCol);
49            map.put(nodeRow,1);
50            map.put(nodeCol,1);
51        }
52        int cnt=0;
53        for(int node:map.keySet()){
54            if(ds.findUParent(node)==node){
55                cnt++;
56            }
57        }
58        int n=stones.length;
59        return n-cnt;
60    }
61}