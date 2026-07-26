class Solution {
      public int helper(String w1, String w2,int i,int j,Integer[][] dp){
       if (i == w1.length()) return w2.length() - j;
        if (j == w2.length()) return w1.length() - i;
        if(dp[i][j] != null) return dp[i][j];
        if (w1.charAt(i) == w2.charAt(j)) {
            return dp[i][j] = helper(w1, w2, i + 1, j + 1,dp);
        }

        int in = 1 + helper(w1, w2, i, j + 1,dp);
        int dt = 1 + helper(w1, w2, i + 1, j,dp);
        int rp = 2 + helper(w1, w2, i + 1, j + 1,dp);
        dp[i][j] = Math.min(in,Math.min(dt,rp));
        return dp[i][j];
    }
    public int minDistance(String s1, String s2) {
        Integer[][] dp = new Integer[s1.length()][s2.length()];
        return helper(s1,s2,0,0,dp);
    }
}