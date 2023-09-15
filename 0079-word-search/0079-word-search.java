class Solution {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited= new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]&&search(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(char[][] board, String word, int index, int i,int j){
        if(word.length()==index){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(index)!=board[i][j]||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(search(board,word,index+1,i-1,j)||
            search(board,word,index+1,i+1,j)||
            search(board,word,index+1,i,j-1)||
            search(board,word,index+1,i,j+1)){
                return true;
            }
        visited[i][j]= false;
        return false;
    }
}