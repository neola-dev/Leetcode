// Last updated: 04/06/2026, 11:14:31
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
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int[][] cells=new int[n*n][3];
        int indx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                cells[indx++]=new int[]{grid[i][j],i,j};
            }
        }
        DisjointSet ds=new DisjointSet(n*n);
        Arrays.sort(cells,(a,b)->a[0]-b[0]);
        boolean[][] active=new boolean[n][n];
        int[] dr={-1,0,0,1};
        int[] dc={0,-1,1,0};
        for(int[] cell:cells){
            int ele=cell[0];
            int r=cell[1];
            int c=cell[2];
            active[r][c]=true;
            for(int ind=0;ind<4;ind++){
                int nr=r+dr[ind];
                int nc=c+dc[ind];
                if(nr>=0 && nr<n && nc>=0 && nc<n && active[nr][nc]){
                    int nodeNo=r*n+c;
                    int adjnodeNo=nr*n+nc;
                    ds.unionBySize(nodeNo,adjnodeNo);
                }
            }
            if(ds.findUParent(0)==ds.findUParent(n*n-1)){
                return ele;
            }
        }
        return -1;
    }
}