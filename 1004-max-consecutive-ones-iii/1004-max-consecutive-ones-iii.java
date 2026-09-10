class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero = 0;
        int st = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            zero = nums[i] == 0 ? zero+1:zero;
            while(zero > k){
                if(nums[st] == 0) zero--;
                st++;
            }
            max = Math.max(max,i-st+1);
        }
        return max;
    }
}