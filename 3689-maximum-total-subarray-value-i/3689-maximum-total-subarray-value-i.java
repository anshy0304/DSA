class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int num:nums){
            max = Math.max(num,max);
            min = Math.min(min,num);
        }
        return k*(max-min);
    }
}