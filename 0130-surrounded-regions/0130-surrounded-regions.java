class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            dfs(board,i,0);
            dfs(board,i,board[i].length-1);
        }
        for(int j=0;j<board[0].length;j++){
            dfs(board,0,j);
            dfs(board,board.length-1,j);
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='*')board[i][j]='O';
            }
        }
    }
    public void dfs(char[][] board,int i, int j){
        if(i<0||i>board.length-1||j<0||j>board[0].length-1)return ;
        if(board[i][j]=='X'||board[i][j]=='*')return ;
        board[i][j] = '*';
        dfs(board,i-1,j);
        dfs(board,i+1,j);
        dfs(board,i,j-1);
        dfs(board,i,j+1);
    }
}