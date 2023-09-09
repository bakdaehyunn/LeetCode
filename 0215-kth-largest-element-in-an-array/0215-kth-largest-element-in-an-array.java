class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for(int num : nums){
            p.offer(num);
            if(p.size()>k){
                p.poll();
            }
        }
        return p.poll();
    }
}