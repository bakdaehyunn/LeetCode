class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(strs.length!=pattern.length()){
            return false;
        }
        Map<Character,String> charToStr = new HashMap<>();
        Map<String,Character> strToChar = new HashMap<>();
        for(int i=0;i< pattern.length();i++){
            if(!charToStr.containsKey(pattern.charAt(i))){
                charToStr.put(pattern.charAt(i),strs[i]);
            }
            if(!strToChar.containsKey(strs[i])){
                strToChar.put(strs[i],pattern.charAt(i));
            }
            if(!charToStr.get(pattern.charAt(i)).equals(strs[i])||!strToChar.get(strs[i]).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}