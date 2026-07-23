class Solution {
    int max = Integer.MIN_VALUE;

    public int helper(int[] nums, int in, int prev,int[][] dp) {
        if (in == nums.length) {
            return 0;
        }
        if(dp[in][prev+1] != -1) return dp[in][prev+1];
        if (prev == -1 || nums[prev] < nums[in]) {

            return dp[in][prev+1] = Math.max(1 + helper(nums, in + 1, in,dp), helper(nums, in + 1, prev,dp));
        } else
            return dp[in][prev+1] = helper(nums, in + 1, prev,dp);

    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] a:dp) Arrays.fill(a,-1);
        return helper(nums, 0, -1,dp);

    }
}