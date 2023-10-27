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
    TreeNode prev;
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        prev = root;
        stack= new Stack<>();
    }
    
    public int next() {
        while(prev!=null){
            stack.push(prev);
            prev = prev.left;
        }
        TreeNode temp = stack.pop();
        prev = temp.right;
        return temp.val;
    }
    
    public boolean hasNext() {
        return prev!=null || !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */