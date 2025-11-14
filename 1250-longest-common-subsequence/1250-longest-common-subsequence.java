class Solution {
    // int helper(String s, String t,int i ,int j,Integer dp[][]){
    //     if(j == t.length() || i == s.length()){
    //         return 0;
    //     }
    //     if(dp[i][j] != null) return dp[i][j];
    //     if(s.charAt(i) == t.charAt(j)){
    //         return dp[i][j] = 1 + helper(s,t,i+1,j+1,dp);
    //     }
    //     return dp[i][j] = Math.max(helper(s,t,i+1,j,dp),helper(s,t,i,j+1,dp));

    // }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j= 1;j<=text2.length();j++){
                if( text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];

                }else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[text1.length()][text2.length()];
    }


}