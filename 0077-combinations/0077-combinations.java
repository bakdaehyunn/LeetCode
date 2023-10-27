class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),n,k,1);
        return result;
    }
    public void backtrack(List<List<Integer>>result, List<Integer> list, int n, int k,int index){
        if(k==0){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=index;i<=n;i++){
            list.add(i);
            backtrack(result,list,n,k-1,i+1);
            list.remove(list.size()-1);
        }
    }
}