class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char currentCell = board[i][j];
                if(currentCell!='.'){
                    if(!seen.add(currentCell+"row"+i)||
                    !seen.add(currentCell+"column"+j)||
                    !seen.add(currentCell+"cube"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}