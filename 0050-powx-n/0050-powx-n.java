class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0) return Math.pow(x,n);
        if(n == Integer.MAX_VALUE) return Math.pow(x,n);
        double dp[] = new double[n];
        dp[0] = x;
        for(int i=1;i<dp.length;i++){
            dp[i] = x*dp[i-1];
        }
        return dp[n-1];

    }
}