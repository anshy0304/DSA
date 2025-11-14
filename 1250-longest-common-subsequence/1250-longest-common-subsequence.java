class Solution {
    int helper(String s, String t,int i ,int j,Integer dp[][]){
        if(j == t.length() || i == s.length()){
            return 0;
        }
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = 1 + helper(s,t,i+1,j+1,dp);
        }
        return dp[i][j] = Math.max(helper(s,t,i+1,j,dp),helper(s,t,i,j+1,dp));

    }
    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] = new Integer[text1.length()+1][text2.length()+1];

        return helper(text1,text2,0,0,dp);
    }


}