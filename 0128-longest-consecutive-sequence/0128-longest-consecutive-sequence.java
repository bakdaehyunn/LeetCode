class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set =new HashSet();
        int longestS=0;
        for(int num : nums){
            set.add(num);
        }
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentS=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentS++;
                }
                longestS=Math.max(currentS,longestS);
            }
        }
        return longestS;

    }
}