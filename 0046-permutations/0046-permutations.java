class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums);
        return result;
    }
    public void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums){
        if(nums.length==list.size()){
            result.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))continue;
            list.add(nums[i]);
            backtrack(result,list,nums);
            list.remove(list.size()-1);
        }
    }
}