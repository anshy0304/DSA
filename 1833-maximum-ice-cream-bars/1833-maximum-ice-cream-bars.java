class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] count = new int[100001];
        for(int num:costs){
            count[num]++;
        }
        int ans = 0;
        for(int i=1;i<100001;i++){
            if(count[i] > 0){
                while(count[i] > 0 && coins >= i) {
                    ans++;
                    count[i]--;
                    coins -= i;
                }
            }
        }
        return ans;
    }
}