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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null&&root.right==null)return true;
        return helper(root.left,root.right);
    }
    public boolean helper(TreeNode leftNode,TreeNode rightNode){
        if(leftNode==null&&rightNode==null)return true;
        if(leftNode==null||rightNode==null||leftNode.val!=rightNode.val)return false;
        return helper(leftNode.left,rightNode.right)&&helper(leftNode.right,rightNode.left);
    }
}