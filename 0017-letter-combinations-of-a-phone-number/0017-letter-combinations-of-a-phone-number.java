class Solution {
    List<String> result ;
    String[] mapping;
    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
        if(digits.length()==0) return result;
        mapping=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(0,digits,new StringBuilder());
        return result;
    }
    public void backtrack(int length,String digits,StringBuilder sb){
        if(length==digits.length()){
            result.add(sb.toString());
            return;
        }
        char ch=digits.charAt(length);
        String str = mapping[ch-'0'];
        for(char c: str.toCharArray()){
            sb.append(c);
            backtrack(length+1,digits,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}