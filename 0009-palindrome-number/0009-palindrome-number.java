class Solution {
    public boolean isPalindrome(int x) {
        int xVal= x;
        int reversed=0;
        while(x>0){
            reversed=10*reversed+x%10;
            x/=10;
        }
        return reversed==xVal;
    }
}