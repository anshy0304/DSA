class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int cz = 0;
            int j;
            for(j=i;j<nums.length;j++){
                  if(nums[j] == 0) cz++;
                if(cz > k) break;
              
                
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
}