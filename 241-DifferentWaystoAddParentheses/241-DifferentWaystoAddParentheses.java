// Last updated: 28/06/2026, 12:18:59
1class Solution {
2    public boolean recur(int i,int j,int n,int m,char[][] board,String word,int k){
3        if(k==word.length())    return true;
4        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!=word.charAt(k))   return false;
5        char ch=board[i][j];
6        board[i][j]='#';
7        boolean up=recur(i-1,j,n,m,board,word,k+1);
8        boolean down=recur(i+1,j,n,m,board,word,k+1);
9        boolean left=recur(i,j-1,n,m,board,word,k+1);
10        boolean right=recur(i,j+1,n,m,board,word,k+1);
11        board[i][j]=ch;
12        return up || down || left || right;
13    }
14    public boolean exist(char[][] board, String word) {
15        int n=board.length;
16        int m=board[0].length;
17        for(int i=0;i<n;i++){
18            for(int j=0;j<m;j++){
19                if(board[i][j]==word.charAt(0)){
20                    if(recur(i,j,n,m,board,word,0)) return true;
21                }
22            }
23        }
24        return false;
25    }
26}