class Solution {
    public int longestConsecutive(int[] nums) {
        int longestS=0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int num: nums){
            int currentS=1;
            int currentN= num;
            while(set.contains(--currentN)){
                currentS++;
                set.remove(currentN);
            }
            currentN = num;
            while(set.contains(++currentN)){
                currentS++;
                set.remove(currentN);
            }
            longestS = Math.max(longestS,currentS);
        }
        return longestS;
    }
}