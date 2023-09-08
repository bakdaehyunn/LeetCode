class Solution {
    public int removeDuplicates(int[] nums) {
       int w = 1;
       for(int r=1;r<nums.length;r++){
           if(nums[r-1]!=nums[r]){
               nums[w] = nums[r];
               w++;
           }
       }
       return w;
    }
}