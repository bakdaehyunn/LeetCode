class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length()!=strs.length){
            return false;
        }
        HashMap<Character,String> charToStr = new HashMap<>();
        HashMap<String,Character> strToChar = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = strs[i];
            
            if(!charToStr.containsKey(c)){
                charToStr.put(c,str);
            }
            if(!strToChar.containsKey(str)){
                strToChar.put(str,c);
            }
            if(!charToStr.get(c).equals(str)||!strToChar.get(str).equals(c)){
                return false;
            }
        }
        return true;
    }
}