class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ans = prices[0] + prices[1];
        if(ans < money){
            ans = money-ans;
            return ans;
        }
        if(ans == money){
            return 0;
        }
        return money;
    }
}