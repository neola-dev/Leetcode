// Last updated: 30/06/2026, 20:37:44
1class Solution {
2    public void solve(char[][] board) {
3        int n=board.length;
4        int m=board[0].length;
5        //explore border O's and mark it as safe
6        for(int i=0;i<n;i++){
7            if(board[i][0]=='O')    bfs(board,i,0); //first col--border
8            if(board[i][m-1]=='O') bfs(board,i,m-1); //last col--border
9        }
10        for(int j=0;j<m;j++){
11            if(board[0][j]=='O')    bfs(board,0,j); //first row-border
12            if(board[n-1][j]=='O') bfs(board,n-1,j); //last row--border
13        }
14        for(int i=0;i<n;i++){
15            for(int j=0;j<m;j++){
16                if(board[i][j]=='O')    board[i][j]='X';
17                else if(board[i][j]=='S')   board[i][j]='O';
18            }
19        }
20    }
21    public void bfs(char[][] board,int r,int c){
22        int n=board.length;
23        int m=board[0].length;
24        Queue<int[]> q=new LinkedList<>();
25        q.add(new int[]{r,c});
26        int[] dirRow={-1,0,0,1};
27        int[] dirCol={0,-1,1,0};
28        board[r][c]='S';
29        while(!q.isEmpty()){
30            int[] cell=q.poll();
31            int row=cell[0];
32            int col=cell[1];
33            for(int i=0;i<4;i++){
34                int nr=row+dirRow[i];
35                int nc=col+dirCol[i];
36                if(nr>=0 && nr<n && nc>=0 && nc<m && board[nr][nc]=='O'){
37                    board[nr][nc]='S';
38                    q.add(new int[]{nr,nc});
39                }
40            }
41        }
42    }
43}