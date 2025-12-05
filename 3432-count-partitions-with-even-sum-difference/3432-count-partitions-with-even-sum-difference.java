class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int count = 0;
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = nums[i] + prefix[i-1];
            
        }
        return (prefix[n-1] % 2 == 0)?n-1:0;
    }
}