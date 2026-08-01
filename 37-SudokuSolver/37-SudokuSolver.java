// Last updated: 01/08/2026, 23:19:39
1class Solution {
2    public void solveSudoku(char[][] board) {
3        solve(board);
4    }
5    public boolean solve(char[][] board){
6        int n=board.length;
7        int m=board[0].length;
8        for(int i=0;i<n;i++){
9            for(int j=0;j<m;j++){
10                if(board[i][j]=='.'){
11                    for(char ch='1';ch<='9';ch++){
12                        if(safe(i,j,board,ch)){
13                            board[i][j]=ch;
14                            if(solve(board)) return true;
15                            else board[i][j]='.';
16                        }
17                    }
18                    return false;
19                }
20            }
21        }
22        return true;
23    }
24    public boolean safe(int row,int col,char[][] board,char ch){
25        for(int i=0;i<board.length;i++){
26            if(board[row][i]==ch)   return false;
27            if(board[i][col]==ch)   return false;
28            if(board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==ch) return false;
29        }
30        return true;
31    }
32}