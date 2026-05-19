class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        int st = 0;
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(i >= k) {
                curr -=nums[st];
                st++;
            }
            curr += nums[i];
            if(i >= k-1)
                max = Math.max(max,(double)curr/k);
        }
        return max;
    }
}