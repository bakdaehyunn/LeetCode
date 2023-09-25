class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    callDFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public void callDFS(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0') return ;
        grid[i][j]='0';
        callDFS(grid,i-1,j);
        callDFS(grid,i+1,j);
        callDFS(grid,i,j-1);
        callDFS(grid,i,j+1);
    }
}