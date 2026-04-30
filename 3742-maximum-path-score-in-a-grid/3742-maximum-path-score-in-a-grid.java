class Solution {
    public int helper(int[][] grid, int k,int i,int j,Integer[][][] dp){
        if (i < 0 || j < 0) return Integer.MIN_VALUE;
        if(i == 0 && j == 0){
            return grid[i][j];
        }
        if(dp[i][j][k] != null) return dp[i][j][k];
        int s = grid[i][j] == 0?0:1;
        if(k-s<0)
            return Integer.MIN_VALUE;
        int a = helper(grid,k-s,i-1,j,dp);
        int b = helper(grid,k-s,i,j-1,dp);
        int max = Math.max(a,b);
        if(max == Integer.MIN_VALUE)return dp[i][j][k] = Integer.MIN_VALUE;
        return dp[i][j][k] = max + grid[i][j];
    }
    public int maxPathScore(int[][] grid, int k) {
        int i = grid.length;
        int j = grid[0].length;
        Integer[][][] dp = new Integer[i][j][k+1];
        int ans =  helper(grid,k,grid.length-1,grid[0].length-1,dp);
        return ans == Integer.MIN_VALUE?-1:ans;
    }
}