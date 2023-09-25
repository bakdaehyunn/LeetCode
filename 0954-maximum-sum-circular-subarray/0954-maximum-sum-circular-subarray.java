class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n =nums.length;
        int maxSum= nums[0];
        int curMax =0;
        int minSum=nums[0];
        int curMin =0;
        int totalSum=0;
        for(int num:nums){
            curMax =Math.max(curMax+num,num);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin+num,num);
            minSum = Math.min(curMin,minSum);
            totalSum+=num;
        }
        return maxSum>0?Math.max(maxSum,totalSum-minSum) :maxSum;
    }
}