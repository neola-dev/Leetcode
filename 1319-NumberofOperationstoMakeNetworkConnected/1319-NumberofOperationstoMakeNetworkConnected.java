// Last updated: 15/07/2026, 11:47:26
1class DisjointSet{
2    List<Integer> rank;
3    List<Integer> parent;
4    DisjointSet(int n){
5        rank=new ArrayList<>();
6        parent=new ArrayList<>();
7        for(int i=0;i<n;i++){
8            parent.add(i);
9            rank.add(0);
10        }
11    }
12    public int findUParent(int node){
13        if(parent.get(node)==node) return node;
14        int ulp=findUParent(parent.get(node));
15        parent.set(node,ulp);
16        return parent.get(node);
17    }
18    public void unionByRank(int u,int v){
19        int ulp_u=findUParent(u);
20        int ulp_v=findUParent(v);
21        if(ulp_u==ulp_v) return;
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
35
36class Solution {
37    public int makeConnected(int n, int[][] connections) {
38        DisjointSet ds=new DisjointSet(n);
39        int cntExtras=0;
40        for(int[] edges:connections){
41            int u=edges[0];
42            int v=edges[1];
43            if(ds.findUParent(u)==ds.findUParent(v)) cntExtras++;
44            else ds.unionByRank(u,v);
45        }
46        int cntC=0;
47        for(int i=0;i<n;i++){
48            if(ds.parent.get(i)==i) cntC++;
49        }
50        System.out.print(cntExtras+" "+cntC);
51        int ans=cntC-1;
52        if(cntExtras>=ans) return ans;
53        return -1;
54    }
55}