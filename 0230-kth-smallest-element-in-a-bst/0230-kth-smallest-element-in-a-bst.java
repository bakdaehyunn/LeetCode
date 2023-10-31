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
    int k;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);
        return result;
    }
    public void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        k--;
        if(k==0){
            result = root.val;
        }
        helper(root.right);
    }
}