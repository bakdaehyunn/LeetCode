/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/

class Solution {
    public Node construct(int[][] grid) {
        return helper(grid,0,0,grid.length);
    }
    public Node helper(int[][] grid, int i,int j, int length){
      if(isSame(grid,i,j,length)){
        return new Node(grid[i][j]==1,true);
      }else{
        Node node = new Node(false,false);
        node.topLeft = helper(grid,i,j,length/2);
        node.topRight = helper(grid,i,j+length/2,length/2);
        node.bottomLeft = helper(grid,i+length/2,j,length/2);
        node.bottomRight = helper(grid,i+length/2,j+length/2,length/2);
        return node;
      }
    }
    public boolean isSame(int[][] grid,int x ,int y,int length){
      for(int i=x;i<x+length;i++){
        for(int j=y;j<y+length;j++){
          if(grid[i][j]!=grid[x][y]){
            return false;
          }
        }
      }
      return true;
    }
}