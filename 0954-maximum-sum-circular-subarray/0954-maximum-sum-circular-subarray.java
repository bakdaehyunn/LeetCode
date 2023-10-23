class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax = 0;
        int maxSum = Integer.MIN_VALUE;
        int curMin = 0;
        int minSum = Integer.MAX_VALUE;
        int total  =0;
        for(int num : nums){
            curMax = Math.max(curMax+num,num);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.min(curMin+num,num);
            minSum = Math.min(curMin,minSum);
            total+= num;
        }
        return maxSum<0? maxSum :Math.max(maxSum,total-minSum); 
    }
}