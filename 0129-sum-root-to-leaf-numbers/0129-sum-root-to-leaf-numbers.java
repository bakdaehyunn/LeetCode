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
    int result;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return result;
    }
    public void helper(TreeNode root,int sum){
        if(root==null) return;
        sum = sum*10+root.val;
        helper(root.left,sum);
        helper(root.right,sum);
        if(root.left==null&&root.right==null){
            result += sum;
        }
        
    }
}