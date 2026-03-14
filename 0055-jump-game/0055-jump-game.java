class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int count = 0;
        int curr = 0;
        for(int i = 0;i<nums.length;i++){
            if(count<i) return false;
            curr = i + nums[i];
            count  = Math.max(count,curr);
        }
        return true;
    }
}