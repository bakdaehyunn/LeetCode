class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet<>();
        dp[0] = true;        
        for(String word : wordDict){
            set.add(word);
        }
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&set.contains(s.substring(j,i))){
                    dp[i]=true;
                }
            }
        }
        return dp[s.length()];
    }
}