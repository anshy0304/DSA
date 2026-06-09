class Solution {
    public void  helper(int[] nums,List<List<Integer>> ans,List<Integer> temp){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int num :nums){
            if(temp.contains(num)) continue;
            temp.add(num);
            helper(nums,ans,temp);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums,ans,temp);
        return ans;
    }
}