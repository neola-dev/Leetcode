// Last updated: 04/06/2026, 11:14:20
class DisjointSet{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    public DisjointSet(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    public int findUParent(int node){
        if(parent.get(node)==node)  return node;
        int ulp=findUParent(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
    }
    public void unionBySize(int u,int v){
        int ulp_u=findUParent(u);
        int ulp_v=findUParent(v);
        if(ulp_u==ulp_v)    return;
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }
        else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }
}
class Solution {
    public boolean isValid(int nr,int nc,int n){
        return nr>=0  && nr<n && nc>=0 && nc<n;
    }
    public int largestIsland(int[][] grid) {
        int n=grid.length;
        DisjointSet ds=new DisjointSet(n*n);
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==0)   continue;
                int[] drow={-1,0,0,1};
                int[] dcol={0,-1,1,0};
                for(int ind=0;ind<4;ind++){
                    int nr=r+drow[ind];
                    int nc=c+dcol[ind];
                    if(isValid(nr,nc,n) && grid[nr][nc]==1){
                        int nodeNo=r*n+c;
                        int adjnodeNo=nr*n+nc;
                        ds.unionBySize(nodeNo,adjnodeNo);
                    }
                }
            }
        }
        //try changing 0's to 1's and get max island
        int max=1;
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                if(grid[r][c]==1)   continue;
                int[] drow={-1,0,0,1};
                int[] dcol={0,-1,1,0};
                Set<Integer> set=new  HashSet<>();
                for(int ind=0;ind<4;ind++){
                    int nr=r+drow[ind];
                    int nc=c+dcol[ind];
                    if(isValid(nr,nc,n) && grid[nr][nc]==1){
                        int adjnode=nr*n+nc;
                        int parent=ds.findUParent(adjnode);
                        set.add(parent);
                    }
                }
                int totSize=0;
                for(int parent:set){
                    totSize+=ds.size.get(ds.findUParent(parent));
                }
                max=Math.max(max,totSize+1);
            }
        }
        for(int col=0;col<n*n;col++){
            max=Math.max(max,ds.size.get(ds.findUParent(col)));
        }
        return max;
    }
}