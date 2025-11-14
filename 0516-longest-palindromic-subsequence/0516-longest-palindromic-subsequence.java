class Solution {
    int helper(String s,String s2,int i,int j,Integer[][] dp){
        if(i == s.length() || j == s2.length()){
            return 0;
        }
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 1+helper(s,s2,i+1,j+1,dp);
        }
        return dp[i][j] = Math.max(helper(s,s2,i+1,j,dp),helper(s,s2,i,j+1,dp));
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        Integer[][] dp = new Integer[s.length()+1][s2.length()+1];
        // for(int i=1;i<=s.length();i++){
        //     for(int j=1;j<=s2.length();j++){
        //         if(s.charAt(i-1) == s2.charAt(j-1)){
        //             dp[i][j] = 1 + dp[i-1][j-1];
        //         }else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        //      }
        // }
        // return dp[s.length()][s2.length()];
        return helper(s,s2,0,0,dp);
    }
}