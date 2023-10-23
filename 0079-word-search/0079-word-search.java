class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(word.charAt(0)==board[i][j]&&backtrack(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word,int length, int i, int j){
        if(length==word.length())return true;
        if(i<0||i>board.length-1||j<0||j>board[i].length-1||word.charAt(length)!=board[i][j]||visited[i][j]){
    return false;
        } 
        visited[i][j]= true;
        if(backtrack(board,word,length+1,i-1,j)||
        backtrack(board,word,length+1,i+1,j)||
        backtrack(board,word,length+1,i,j-1)||
        backtrack(board,word,length+1,i,j+1))return true;
        visited[i][j]=false;
        return false;
    }
}