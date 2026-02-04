class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;
        for(int i=0;i<fruits.length;i++){
            int count = 1;
            for(int j=0;j<baskets.length;j++){
                if(baskets[j] >= fruits[i]) {
                    baskets[j] = -1;
                    count = 0;
                    break;
                }
            }
            ans += count;
        }
        return ans;
    }
}