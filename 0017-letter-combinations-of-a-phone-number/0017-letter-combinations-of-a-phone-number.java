class Solution {
    String[] mapping;
    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        mapping= new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.length()==0)return result;
        backtrack(result,new StringBuilder(),0,digits);
        return result;
    }
    public void backtrack(List<String> result, StringBuilder sb, int index,String digits){
        if(index==digits.length()){
            result.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        String str = mapping[c-'0'];
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            backtrack(result,sb,index+1,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}