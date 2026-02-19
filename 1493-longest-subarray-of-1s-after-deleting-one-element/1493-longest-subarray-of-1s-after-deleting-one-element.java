class Solution {
    public int longestSubarray(int[] nums) {
        int st = 0;
        int max = 0;
        int cz = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) cz++;
            while(cz>1){
                if(nums[st] == 0)cz--;
                st++;
            }
            max = Math.max(max,i-st);

        }
        return max;
    }
}