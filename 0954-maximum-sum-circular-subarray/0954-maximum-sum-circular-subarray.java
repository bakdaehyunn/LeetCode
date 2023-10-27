class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax =0;
        int maxSum= Integer.MIN_VALUE;
        int curMin = 0;
        int minSum= Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<nums.length;i++){
            curMax= Math.max(nums[i],curMax+nums[i]);
            maxSum= Math.max(curMax,maxSum);
            curMin = Math.min(nums[i],curMin+nums[i]);
            minSum= Math.min(curMin,minSum);
            total+= nums[i];
        }
        return maxSum<0?maxSum:Math.max(maxSum,total-minSum);
        
    }
}