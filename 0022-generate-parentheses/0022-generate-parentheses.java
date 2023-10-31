class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result =new ArrayList<>();
        backtrack(result,"",0,0,n);
        return result;
    }
    public void backtrack(List<String> result, String str, int open, int close, int n){
        if(str.length()==n*2){
            result.add(str);
        }
        if(open<n)backtrack(result,str+"(",open+1,close,n);
        if(close<open)backtrack(result,str+")",open,close+1,n);
    }
}