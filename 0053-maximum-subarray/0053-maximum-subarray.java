class Solution {
    public int maxSubArray(int[] nums) {
        int curMax =nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            curMax = Math.max(nums[i],curMax+nums[i]);
            maxSum = Math.max(maxSum,curMax);
        }
        return maxSum;
    }
}