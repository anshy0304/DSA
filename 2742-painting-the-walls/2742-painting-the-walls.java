class Solution {

    public int helper(int n,int w,int[][] dp,int[] cost, int[] time){
        if(w <= 0) return 0;
        if(n == cost.length) return (int)1e9;
        if(dp[n][w] != -1) return dp[n][w];
        
            dp[n][w] = Math.min(cost[n] + helper(n+1,w-time[n]-1,dp,cost,time),helper(n+1,w,dp,cost,time));
        
        return dp[n][w];
    }
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int w = time.length;
        int dp[][] = new int[n+1][w+1];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return helper(0,w,dp,cost,time);
    }
}