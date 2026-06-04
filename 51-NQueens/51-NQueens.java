// Last updated: 04/06/2026, 11:20:15
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,n,res);
        return res;
    }
    public void solve(int col,char[][] board,int n,List<List<String>> res){
        if(col==n){
            List<String> ls=new ArrayList<>();
            for(int i=0;i<n;i++){
                ls.add(new String(board[i]));
            }
            res.add(ls);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                solve(col+1,board,n,res);
                board[row][col]='.';
            }
        }
    }
    public static boolean isSafe(int row,int col,char[][] board,int n){
        //left in same row
        for(int i=col;i>=0;i--){
            if(board[row][i]=='Q')  return false;
        }
        //upper dia
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')    return false;
        }
        //lower dia
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(board[i][j]=='Q')    return false;
        }
        return true;
    }
}