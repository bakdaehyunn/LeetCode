class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set = new HashSet<>();
        int longestS =1;
        for(int num : nums){
            set.add(num);
        }
        for(int num: nums){
            int currentNum = num;
            int currentS = 1;
            while(set.contains(--currentNum)){
                set.remove(currentNum);
                currentS++;
            }
            currentNum=num;
            while(set.contains(++currentNum)){
                set.remove(currentNum);
                currentS++;
            }
            longestS = Math.max(longestS,currentS);
        }
        return longestS;

    }
}