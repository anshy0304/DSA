class Solution {
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> sub, int start) {
        if (start == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;
            sub.add(nums[i]);
            ans.add(new ArrayList<>(sub));
            helper(nums, ans, sub, i + 1);
            sub.remove(sub.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        List<Integer> sub = new ArrayList<>();

        helper(nums, ans, sub, 0);

        return ans;
    }
}