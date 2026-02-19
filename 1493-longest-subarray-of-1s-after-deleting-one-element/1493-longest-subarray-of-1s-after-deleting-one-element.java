class Solution {
    public int longestSubarray(int[] nums) {
        int st = 0;
        int max = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            int countzero = 0;
            int j;
            for(j=i;j<nums.length;j++){
                if(nums[j] == 0) countzero++;
                if(countzero > 1){
                    break;
                }
              
            }
            max = Math.max(j-i,max);
        }
        return max-1;
    }
}