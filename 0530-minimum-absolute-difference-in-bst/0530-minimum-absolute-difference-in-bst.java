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
    TreeNode prev;
    int min;
    public int getMinimumDifference(TreeNode root) {
        min=Integer.MAX_VALUE;
        prev = null;
        helper(root);
        return min;
    }
    public void helper(TreeNode root){
        if(root==null)return ;
        helper(root.left);
        if(prev!=null){
            min=Math.min(min,root.val-prev.val);
        }
        prev = root;
        helper(root.right);
    }
}