class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] c = new char[26];
            for(int i=0;i<str.length();i++) c[str.charAt(i)-'a']++;
            String s = new String(c);
            if(!map.containsKey(s)) map.put(s,new ArrayList<>());
            map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}