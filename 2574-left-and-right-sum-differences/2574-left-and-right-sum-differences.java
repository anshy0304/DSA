class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] rs = new int[n];
        int[] ls = new int[n];
        rs[0] = 0;
        ls[n-1] = 0;
        for(int i=1;i<n;i++){
            rs[i] = rs[i-1] + nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            ls[i] = ls[i+1] + nums[i+1];
        }
        for(int i = 0;i<n;i++){
            ls[i] = Math.abs(ls[i]-rs[i]);
        }
        return ls;
    }
}

//