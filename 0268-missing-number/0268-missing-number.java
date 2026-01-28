class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n* (n+1)/2;
        int ans = 0;
        for(int i:nums) ans+= i;
        return sum - ans;
    }
}