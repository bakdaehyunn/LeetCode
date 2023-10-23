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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean direction=false;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = queue.poll();
                currentList.add(current.val);
                if(current.left!=null) queue.offer(current.left);
                if(current.right!=null)queue.offer(current.right);
                if(i==size-1&&direction){
                    Collections.reverse(currentList);
                }
            }
            result.add(currentList);
            direction = !direction;
        }
        return result;
    }
}