class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] n1 = Arrays.copyOfRange(nums1,0,m);
        int index=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(n1[i]<nums2[j]){
                nums1[index]=n1[i];
                index++;
                i++;
            }else{
                nums1[index]=nums2[j];
                index++;
                j++;
            }
        }
        while(i<m){
            nums1[index] =n1[i];
            index++;
            i++;
        }
        while(j<n){
            nums1[index] =nums2[j];
            index++;
            j++;
        }
    }
}