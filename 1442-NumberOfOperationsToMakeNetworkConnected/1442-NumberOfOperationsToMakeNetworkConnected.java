// Last updated: 04/06/2026, 11:12:48
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
    public int makeConnected(int n, int[][] connections) {
        DisjointSet ds=new DisjointSet(n);
        int cntExtras=0;
        for(int[] edges:connections){
            int u=edges[0];
            int v=edges[1];
            if(ds.findUParent(u)==ds.findUParent(v)){
                cntExtras++;
            }
            else{
                ds.unionByRank(u,v);
            }
        }
        int cntC=0;
        for(int i=0;i<n;i++){
            if(ds.parent.get(i)==i)    cntC++;
        }
        int ans=cntC-1;
        if(cntExtras>=cntC-1) return ans;
        return -1;
    }
}