class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0;
        int maxSum=Integer.MIN_VALUE;
        int curMin=0;
        int minSum=Integer.MAX_VALUE;
        int total=0;
        for(int num:nums){
            curMax = Math.max(num,curMax+num);
            maxSum= Math.max(maxSum,curMax);
            curMin = Math.min(num,curMin+num);
            minSum= Math.min(minSum,curMin);
            total+=num;
        }
        return maxSum<0? maxSum:Math.max(maxSum,total-minSum);
    }
}