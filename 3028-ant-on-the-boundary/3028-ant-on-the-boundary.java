class Solution {
    public int returnToBoundaryCount(int[] nums) {
        if(nums.length == 1 || nums.length == 0) return 0;

        int ant = 0;
        int count = 0;
        for(int i =0;i<nums.length;i++){
            ant+= nums[i];
            if(ant == 0) count++;
        }
        return count;
    }
}