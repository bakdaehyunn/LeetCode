class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),1,n,k);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> list, int start,int n,int k ){
        if(k==0){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            backtrack(result,list,i+1,n,k-1);
            list.remove(list.size()-1);
        }
    }
}