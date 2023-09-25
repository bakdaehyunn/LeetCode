/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxLevel;
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
        result = new ArrayList<>();
        if(root==null) return result;
        maxLevel=0;
        
        rightView(root,1);
        return result;
    }
    public void rightView(TreeNode root,int level){
        if(root==null) return;
        if(maxLevel<level){
            result.add(root.val);
            maxLevel=level;
        }
        rightView(root.right,level+1);
        rightView(root.left,level+1);
    }
}