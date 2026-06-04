// Last updated: 04/06/2026, 11:20:13
class Solution {
    public int totalNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int[] left=new int[n];
        int[] lowerDia=new int[2*n-1];
        int[] upperDia=new int[2*n-1];
        solve(0,res,board,n,left,lowerDia,upperDia);
        return res.size();
    }
    public static void solve(int col,List<List<String>> res,char[][] board,int n,int[] left,int[] lowerDia,int[] upperDia){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(left[row]==0 && lowerDia[row+col]==0 && upperDia[n-1+col-row]==0){
                board[row][col]='Q';
                left[row]=1;
                lowerDia[row+col]=1;
                upperDia[n-1+col-row]=1;
                solve(col+1,res,board,n,left,lowerDia,upperDia);
                board[row][col]='.';
                left[row]=0;
                lowerDia[row+col]=0;
                upperDia[n-1+col-row]=0;
            }
        }
    }
}