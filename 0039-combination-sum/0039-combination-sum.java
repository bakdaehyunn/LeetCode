class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums, int target, int index){
        if(target==0)result.add(new ArrayList<>(list));
        else if(target<0) return;
        else{
            for(int i=index;i<nums.length;i++){
                list.add(nums[i]);
                backtrack(result,list,nums,target-nums[i],i);
                list.remove(list.size()-1);
            }
        }
    }
}