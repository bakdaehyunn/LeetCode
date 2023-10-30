class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int length = nums1.length-1;
        while(j>=0){
            if(i>=0&&nums1[i]>nums2[j]){
                nums1[length] = nums1[i];
                length--;
                i--;
            }else{
                nums1[length]=nums2[j];
                length--;
                j--;
            }
        }
    }
}