class Solution {
    public int minimumCost(int[] cost) {
        int count = 0;
        int sum = 0;
        if(cost.length == 2){
            for(int num:cost) sum += num;
            return sum;
        }
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(count == 2){
                if(cost[i] <= cost[i+1]){
                    count = 0;
                    continue;
                }
            }
            sum += cost[i];
            count++;
        }
        return sum;
    }
}