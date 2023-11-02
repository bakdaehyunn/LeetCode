class Solution {
    String[] map;
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length()==0)return result;
        map= new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(result,new StringBuilder(),digits,0);
        return result;
    }
    public void backtrack(List<String> result, StringBuilder sb, String digits,int index){
        if(index==digits.length()){
            result.add(sb.toString());
            return;
        }
        String str = map[digits.charAt(index)-'0'];
        for(char c : str.toCharArray()){
            sb.append(c);
            backtrack(result,sb,digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}