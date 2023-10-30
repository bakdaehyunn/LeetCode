class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] ch = new char[26];
            for(char c : str.toCharArray()) ch[c-'a']++;
            String s = new String(ch);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}