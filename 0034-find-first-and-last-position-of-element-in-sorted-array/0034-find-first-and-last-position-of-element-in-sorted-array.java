class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = leftFind(nums,target);
        int end = rightFind(nums,target);
        return new int[]{start,end};
    }
    public int leftFind(int[] nums, int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end = mid-1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return index;
    }
    public int rightFind(int[] nums, int target){
        int index =-1;
        int start =0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                index = mid;
                start = mid+1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return index;
    }
}