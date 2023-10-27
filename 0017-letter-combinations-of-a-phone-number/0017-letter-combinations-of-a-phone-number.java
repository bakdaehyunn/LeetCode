class Solution {
    String[] map;
    
    public List<String> letterCombinations(String digits) {
        List<String> result  =new ArrayList<>();
        if(digits.length()==0)return result;
        map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result,digits,new StringBuilder(),0);
        return result;
    }
    public void backtrack(List<String> result,String digits,StringBuilder sb, int length){
        if(digits.length()==length){
            result.add(sb.toString());
            return ;
        }
        char c = digits.charAt(length);
        String s = map[c-'0'];
        for(char ch:s.toCharArray()){
            sb.append(ch);
            backtrack(result, digits,sb,length+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}