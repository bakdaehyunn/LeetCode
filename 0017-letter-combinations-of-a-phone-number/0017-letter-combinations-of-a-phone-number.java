class Solution {
    String[] mapping;
    List<String>result;
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        if(digits.length()==0)return result;
        mapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,digits,new StringBuilder());
        return result;
    }
    public void backtrack(int length,String digits,StringBuilder sb){
        if(length==digits.length()){
            result.add(sb.toString());
            return ;
        }
        char c = digits.charAt(length);
        String s = mapping[c-'0'];
        for(char ch: s.toCharArray()){
            sb.append(ch);
            backtrack(length+1,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}