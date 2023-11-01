class Solution {
    public String longestPalindrome(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            int odd = expand(s,i,i);
            int even = expand(s,i,i+1);
            int length= Math.max(odd,even);
            if(length>right-left+1){
                left = i- (length-1)/2;
                right = i+ length/2;
            }
        }
        return s.substring(left,right+1);
    }
    public int expand(String s, int left, int right){
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}