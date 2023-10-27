class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int num:nums1){
            heap.offer(new int[]{num+nums2[0],0});
        }
        while(k!=0&&!heap.isEmpty()){
            int[] pair = heap.poll();
            int sum = pair[0];
            int idx = pair[1];
            
            List<Integer> list = new ArrayList<>();
            list.add(sum-nums2[idx]);
            list.add(nums2[idx]);
            result.add(list);
            if(idx+1<nums2.length){
                heap.offer(new int[]{sum-nums2[idx]+nums2[idx+1],idx+1});
            }
            k--;
        }
        return result;
    }
}