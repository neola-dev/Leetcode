// Last updated: 04/06/2026, 11:13:50
class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> rank=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
    }
    public int findUParent(int node){
        if(node==parent.get(node)){
            return node;
        }
        int ulp=findUParent(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionByRank(int u,int v){
        int ulp_u=findUParent(u);
        int ulp_v=findUParent(v);
        if(ulp_u==ulp_v)    return;
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_v)<rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }
        else{
            parent.set(ulp_v,ulp_u);
            int rankU=rank.get(ulp_u);
            rank.set(ulp_u,rankU+1);
        }
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        int maxRow=0;
        int maxCol=0;
        for(int[] each:stones){
            maxRow=Math.max(maxRow,each[0]);
            maxCol=Math.max(maxCol,each[1]);
        }
        DisjointSet ds=new DisjointSet(maxRow+maxCol+2);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] each:stones){
            int nodeRow=each[0];
            int nodeCol=each[1]+maxRow+1;
            ds.unionByRank(nodeRow,nodeCol);
            map.put(nodeRow,1);
            map.put(nodeCol,1);
        }
        int cnt=0;
        for(int node:map.keySet()){
            if(ds.findUParent(node)==node){
                cnt++;
            }
        }
        int n=stones.length;
        return n-cnt;
    }
}