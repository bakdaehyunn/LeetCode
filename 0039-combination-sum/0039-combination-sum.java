class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> list , int[] candidates,int target , int index){
        if(target==0){
            result.add(new ArrayList<>(list));
            return ;
        }
        if(target<0){
            return ;
        }
        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            backtrack(result,list,candidates,target-candidates[i],i);
            list.remove(list.size()-1);
        }
    }
}