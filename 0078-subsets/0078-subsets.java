class Solution {

    public void helper(int[] nums,List<List<Integer>> result,List<Integer> path){
        if(path.size() == nums.length){
            return;
        }
        for(int num:nums){
            if(path.contains(num)) return;
            path.add(num);
            result.add(new ArrayList<>(path));
            helper(nums,result,path);

            path.remove(path.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        List<Integer> path = new ArrayList<>();
        helper(nums,result,path);
        return result;
    }
}