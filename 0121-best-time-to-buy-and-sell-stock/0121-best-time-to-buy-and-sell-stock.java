class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
                
            }
            int curr = prices[i] - buy;
            max = Math.max(curr,max);
            
        }
        return max;
    }
}