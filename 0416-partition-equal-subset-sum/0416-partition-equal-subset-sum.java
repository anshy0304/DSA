class Solution {

    public boolean helper(int[] nums,int sum,int n,int[][] dp){
        if(sum == 0) return true;
        if(n == 0) return false;
        if(dp[n][sum] != -1) return dp[n][sum] == 1;
        boolean res;
        if(nums[n-1] <= sum){
             res = helper(nums,sum-nums[n-1],n-1,dp) || helper(nums,sum,n-1,dp);
        }else res = helper(nums,sum,n-1,dp);
             dp[n][sum] = res ?1:0;
        return res;
        
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums)
            sum += num;
        if (sum % 2 != 0)
            return false;
        int dp[][] = new int[n + 1][(sum / 2) + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return helper(nums, sum / 2, n, dp);
    }
}