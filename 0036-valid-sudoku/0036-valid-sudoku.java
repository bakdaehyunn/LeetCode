class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int currentVal = board[i][j];
                if(currentVal!='.'){
                    if(!seen.add(currentVal+"row"+i)||
                    !seen.add(currentVal+"column"+j)||
                    !seen.add(currentVal+"cube"+i/3+""+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}