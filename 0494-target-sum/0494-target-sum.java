class Solution {
    public int countSum(int[] nums,int sum,int[][] dp) {
        dp[0][0] = 1;
        for(int i=1;i<nums.length+1;i++){
            for(int j=0;j<sum +1 ;j++){
                 if(nums[i-1] <= j){
                        dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                    }else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length][sum];
    }
    
    public int findTargetSumWays(int[] nums, int diff) {
        int sum = 0;
        int n = nums.length;
        for(int num : nums) sum += num;
        if(sum < diff) return 0;
        if((sum+diff)<0 || ((sum+diff) % 2) != 0) return 0;
        sum = (sum + diff) / 2;
        int[][] dp = new int[n+1][sum+1];
        int count = countSum(nums,sum,dp);
        return count;
    }
}