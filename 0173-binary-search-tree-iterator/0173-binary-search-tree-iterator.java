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
class BSTIterator {
    TreeNode current;
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        current = root;
        stack = new Stack<>();
    }
    
    public int next() {
        
        while(current!=null){
          stack.push(current);
          current = current.left;
        }
        TreeNode prev = stack.pop();
        current = prev.right;
        return prev.val;
    }
    
    public boolean hasNext() {
        return current !=null || !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */