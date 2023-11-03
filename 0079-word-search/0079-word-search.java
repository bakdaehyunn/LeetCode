class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)&&backtrack(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word, int i, int j, int index){
        if(index==word.length()){
            return true;
        }
        if(i<0||i>board.length-1||j<0||j>board[0].length-1||board[i][j]!=word.charAt(index)||visited[i][j])return false;
        visited[i][j]= true;
        if(backtrack(board,word,i-1,j,index+1)||
        backtrack(board,word,i+1,j,index+1)||
        backtrack(board,word,i,j-1,index+1)||
        backtrack(board,word,i,j+1,index+1)){
            return true;
        }
        visited[i][j]=false;
        return false;
        
    }
}