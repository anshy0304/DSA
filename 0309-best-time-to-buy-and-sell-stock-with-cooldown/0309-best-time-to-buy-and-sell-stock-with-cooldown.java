class Solution {

    public int helper(int[] p,int i ,int prev,Integer[][] dp){
        if(i >= p.length) return 0;
        if(dp[i][prev] != null) return dp[i][prev];
        if(prev == 1){
            return dp[i][prev] =  Math.max(-p[i] + helper(p,i+1,0,dp),helper(p,i+1,1,dp));
        }
        else return dp[i][prev] = Math.max(p[i] + helper(p,i+2,1,dp),helper(p,i+1,0,dp));
    }

    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];
       return helper(prices,0,1,dp); 
    }
}