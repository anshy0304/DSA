class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int num:nums) sum += num;
        if(sum %2 !=0) return false;
        boolean dp[][] = new boolean[n+1][(sum/2)+1];
        dp[0][0]  = true;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<(sum/2)+1;j++){
                if(j == 0) dp[i][j] = true;
                else {
                    if(nums[i-1] <= j){
                        dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                    }else dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum/2];
    }
}