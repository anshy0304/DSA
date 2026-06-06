class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int rs = 0;
        int ls = 0;
        int t = 0;
        for(int i : nums){
            t += i;
        }
        for(int i=0;i<n;i++){
            int c = nums[i] ; 
            rs = t - ls - c;
            nums[i] = Math.abs(rs-ls);
            ls += c;
        }
        return nums;
    }
}