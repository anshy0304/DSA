class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i=0;i<accounts.length;i++){
            int max = 0;
            for(int j=0;j<accounts[0].length;j++){
                max += accounts[i][j];
                ans = Math.max(ans,max);
            }
        }
        return ans;
    }
}