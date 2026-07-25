class Solution {
    public boolean helper(int[] nums,int sum,int i,Integer[][] dp){
        if(sum == 0) return true;
        if(sum < 0 || i == nums.length) return false;
        if(dp[sum][i] != null) return dp[sum][i] == 1;
        boolean res;
        if(sum >= nums[i]) {
            res =  helper(nums,sum-nums[i],i+1,dp) || helper(nums,sum,i+1,dp);
        }
        else res = helper(nums,sum,i+1,dp);
            dp[sum][i] = res ? 1 : 0;
            return res;
    }
    
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n:nums) sum += n;
        if(sum%2 != 0) return false;
        Integer[][] dp = new Integer[(sum/2) + 1][nums.length];
        return helper(nums,sum/2,0,dp);
    }
}