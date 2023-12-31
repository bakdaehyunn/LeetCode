class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rot(nums,0,nums.length-1);
        rot(nums,0,k-1);
        rot(nums,k,nums.length-1);
    }
    public void rot(int[] nums, int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}