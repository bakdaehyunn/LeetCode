class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ca = s.toCharArray();
        char[] cb = t.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        String sa = new String(ca);
        String sb = new String(cb);
        if(sa.equals(sb)){
            return true;
        }
        return false;
    }
}