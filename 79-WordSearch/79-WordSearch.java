// Last updated: 04/06/2026, 11:19:41
class Solution {
    public boolean search(int i,int j,int n,int m,char[][] board,String word,int k){
        if(k==word.length())    return true;
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!=word.charAt(k))   return false;
        char ch=board[i][j];
        board[i][j]='#'; //to know it is visited
        boolean opt1=search(i-1,j,n,m,board,word,k+1); //up
        boolean opt2=search(i+1,j,n,m,board,word,k+1); //down
        boolean opt3=search(i,j-1,n,m,board,word,k+1); //left
        boolean opt4=search(i,j+1,n,m,board,word,k+1); //right
        board[i][j]=ch; //replace it with org char
        return opt1 || opt2 || opt3 || opt4;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(search(i,j,n,m,board,word,0))    return true;
                }
            }
        }
        return false;
    }
}