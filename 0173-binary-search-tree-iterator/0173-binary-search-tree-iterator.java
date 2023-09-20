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
    TreeNode next;
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        next = root;
        stack = new Stack<>();
    }
    
    public int next() {
        
        while(next!=null){
          stack.push(next);
          next = next.left;
        }
        TreeNode current = stack.pop();
        next = current.right;
        return current.val;
    }
    
    public boolean hasNext() {
        return next !=null || !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */