class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(result,new ArrayList<>(),1,n,k);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> list, int start,int n, int k){
      if(list.size()==k){
        result.add(new ArrayList<Integer>(list));
        return;
      }
      for(int i=start;i<=n-(k-list.size())+1;i++){
        list.add(i);
        backtrack(result,list,i+1,n,k);
        list.remove(list.size()-1);

      }
    }
}