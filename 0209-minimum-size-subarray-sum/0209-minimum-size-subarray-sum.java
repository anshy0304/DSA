class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int st = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                len = Math.min(i-st+1,len);
                sum -= nums[st];
                st++;
            }
        }
        return len == Integer.MAX_VALUE?0:len;
    }
}