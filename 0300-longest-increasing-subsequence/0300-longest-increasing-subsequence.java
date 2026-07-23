class Solution {
 

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int lis = 0;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[i] > nums[j]){
                    max = Math.max(max,dp[j]+1);
                }
            }
            dp[i] = Math.max(dp[i],max);
            lis = Math.max(dp[i],lis);
        }
        return lis;

    }
}