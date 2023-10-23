class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int num: nums1){
            queue.offer(new int[]{num+nums2[0],0});
        }
        while(k!=0&&!queue.isEmpty()){
            int[] arr = queue.poll();
            int sum =  arr[0];
            int pos = arr[1];
            List<Integer> list = new ArrayList<>();
            list.add(sum-nums2[pos]);
            list.add(nums2[pos]);
            result.add(list);
            if(pos+1<nums2.length){
                queue.offer(new int[]{sum-nums2[pos]+nums2[pos+1],pos+1});
            }
            k--;
        }
        return result;
    }
}