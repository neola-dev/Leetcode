// Last updated: 04/06/2026, 11:18:52
class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        //explore border O's and mark it as safe
        for(int i=0;i<n;i++){
            if(board[i][0]=='O')    bfs(board,i,0); //first col--border
            if(board[i][m-1]=='O') bfs(board,i,m-1); //last col--border
        }
        for(int j=0;j<m;j++){
            if(board[0][j]=='O')    bfs(board,0,j); //first row-border
            if(board[n-1][j]=='O') bfs(board,n-1,j); //last row--border
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')    board[i][j]='X';
                else if(board[i][j]=='S')   board[i][j]='O';
            }
        }
    }
    public void bfs(char[][] board,int r,int c){
        int n=board.length;
        int m=board[0].length;
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{r,c});
        int[] dirRow={-1,0,0,1};
        int[] dirCol={0,-1,1,0};
        board[r][c]='S';
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int row=cell[0];
            int col=cell[1];
            for(int i=0;i<4;i++){
                int nr=row+dirRow[i];
                int nc=col+dirCol[i];
                if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='O'){
                    board[nr][nc]='S';
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}