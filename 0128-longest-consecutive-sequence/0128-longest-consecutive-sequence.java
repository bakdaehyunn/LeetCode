class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        Set<Integer> set =new HashSet<>();
        for(int num :nums){
            set.add(num);
        }
        for(int num :nums){
            int currentS=1;
            int currentN=num;
            while(set.contains(--currentN)){
                currentS++;
                set.remove(currentN);
            }
            currentN=num;
            while(set.contains(++currentN)){
                currentS++;
                set.remove(currentN);
            }
            longest=Math.max(longest,currentS);
        }
        return longest;
    }
}