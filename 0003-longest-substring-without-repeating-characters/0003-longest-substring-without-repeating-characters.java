class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                longest = Math.max(longest,set.size());
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return longest;
    }
}