// Last updated: 28/06/2026, 14:17:42
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        for(int i=0;i<9;i++){
4            for(int j=0;j<9;j++){
5                if(board[i][j]!='.'){
6                    char ch=board[i][j];
7                    if(!isSafe(i,j,board,ch)){
8                        return false;
9                    }
10                }
11            }
12        }
13        return true;
14    }
15    public boolean isSafe(int row,int col,char[][] board,char ch){
16        for(int i=0;i<board.length;i++){
17            if(i!=row && board[i][col]==ch)   return false;
18            if(i!=col && board[row][i]==ch)   return false;
19        }
20        int startRow=3*(row/3);
21        int startCol=3*(col/3);
22        for(int r=startRow;r<startRow+3;r++){
23            for(int c=startCol;c<startCol+3;c++){
24                if((r!=row || c!=col) && board[r][c]==ch) return false;
25            }
26        }
27        return true;
28    }
29}