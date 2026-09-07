// Last updated: 07/09/2026, 14:29:10
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        char[][] board=new char[n][n];
4        for(int i=0;i<n;i++){
5            Arrays.fill(board[i],'.');
6        }
7        List<List<String>> res=new ArrayList<>();
8        solve(0,board,n,res);
9        return res;
10    }
11    public void solve(int col,char[][] board,int n,List<List<String>> res){
12        if(col==n){
13            List<String> sub=new ArrayList<>();
14            for(int i=0;i<n;i++){
15                sub.add(new String(board[i]));
16            }
17            res.add(new ArrayList<>(sub));
18            return;
19        }
20        for(int r=0;r<n;r++){
21            if(safe(r,col,board,n)){
22                board[r][col]='Q';
23                solve(col+1,board,n,res);
24                board[r][col]='.';
25            }
26        }
27    }
28    public boolean safe(int r,int c,char[][] board,int n){
29        for(int i=c;i>=0;i--){
30            if(board[r][i]=='Q') return false;
31        }
32        for(int i=r,j=c;i>=0 && j>=0;i--,j--){
33            if(board[i][j]=='Q') return false;
34        }
35        for(int i=r,j=c;i<n && j>=0;i++,j--){
36            if(board[i][j]=='Q') return false;
37        }
38        return true;
39    }
40}