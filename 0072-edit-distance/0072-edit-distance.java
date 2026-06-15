class Solution {
    public int helper(String w1,String w2,int i,int j,int[][] dp){
        if (i == w1.length()) return w2.length() - j;
        if (j == w2.length()) return w1.length() - i;
        if(dp[i][j] != -1) return dp[i][j];
        if (w1.charAt(i) == w2.charAt(j)) {
            return dp[i][j] = helper(w1, w2, i + 1, j + 1,dp);
        }

        int in = 1 + helper(w1, w2, i, j + 1,dp);
        int dt = 1 + helper(w1, w2, i + 1, j,dp);
        int rp = 1 + helper(w1, w2, i + 1, j + 1,dp);
        dp[i][j] = Math.min(in,Math.min(dt,rp));
        return dp[i][j];
    }
    public int minDistance(String w1, String w2) {
        int[][] dp = new int[w1.length()][w2.length()];
        for(int[] n:dp) {
            Arrays.fill(n,-1);
        }
        return helper(w1,w2,0,0,dp);
    }
}