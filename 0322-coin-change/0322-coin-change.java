class Solution {
    public int helper(int[] coins,int amount,int i,int[][] dp){
        if(amount == 0) return 0;
        if(i == coins.length || amount < 0) return (int)1e9;
        if(dp[amount][i] != -1) return dp[amount][i];
        return dp[amount][i] =  Math.min(1+helper(coins,amount - coins[i],i,dp),helper(coins,amount,i+1,dp));
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount+1][coins.length];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        int result = helper(coins,amount,0,dp);
        return result == (int)1e9 ? -1 : result;
    }
}