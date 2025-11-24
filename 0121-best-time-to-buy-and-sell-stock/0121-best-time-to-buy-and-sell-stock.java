class Solution {
    public int maxProfit(int[] prices) {
    //    int buy_price = Integer.MAX_VALUE;
    //    int max_profit = 0;
    //    for(int i=0;i<prices.length;i++) {
    //         if(buy_price<prices[i]) {
    //             int profit = prices[i] - buy_price;
    //             max_profit = Math.max(profit,max_profit);
    //         }else buy_price = prices[i];
    //    }
    //    return max_profit;

    int[] buy = new int[prices.length];
    int[] sell = new int[prices.length];
    int profit[] = new int[prices.length];
    buy[0] = prices[0];
    sell[sell.length-1] = prices[prices.length-1];
    for(int i=1;i<buy.length;i++){
        buy[i] = Math.min(buy[i-1],prices[i]);
    }
    for(int i=sell.length-2;i>=0;i--){
        sell[i] = Math.max(sell[i+1],prices[i]);
    }
    int max = 0;
    for(int i=0;i<profit.length;i++){
        max = Math.max(max,sell[i] - buy[i]);
    }
    return max;
    }
}