class Solution {
    public boolean isPalindrome(int x) {
        char[] c = String.valueOf(x).toCharArray();
        for(int start=0,end=c.length-1;start<end;start++,end--){
            if(c[start]!=c[end]){
                return false;
            }
        }
        return true;
    }
}