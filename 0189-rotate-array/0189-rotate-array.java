class Solution {
    public void rotate(int[] nums, int k) {
        k= k%nums.length;
        for(int start=0,end=nums.length-1;start<end;start++,end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]= temp;
        }
        for(int start=0,end=k-1;start<end;start++,end--){
            int temp = nums[start];
            nums[start]= nums[end];
            nums[end] =temp;
        }
        for(int start=k,end=nums.length-1;start<end;start++,end--){
            int temp= nums[start];
            nums[start] = nums[end];
            nums[end] =temp;
        }
    }
}