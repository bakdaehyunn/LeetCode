class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =new HashSet<>();
        int longestS=0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : nums){
            int currentS=1;
            int currentN = num;
            while(set.contains(--currentN)){
                currentS++;
                set.remove(currentN);
            }
            currentN = num;
            while(set.contains(++currentN)){
                currentS++;
                set.remove(currentN);
            }
            longestS =  Math.max(longestS,currentS);
        }
        return longestS;


    }
}