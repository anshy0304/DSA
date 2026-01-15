class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    //   int n = nums.length;
    //   int max = Integer.MIN_VALUE;
    //  for(int i=0;i<n;i++){
    //     int sum = 0;
    //     for(int j=i;j<i+n;j++){
    //         int in = j%n;
    //         sum += nums[in];
    //         max = Math.max(max,sum);

    //     }
    //  }
    //  return max;
    int max1 = maxSubArray(nums);
    int total = 0;
    for(int i:nums) total += i;
    for(int i=0;i<nums.length;i++){
        nums[i]*=-1;
    }
    int sum = maxSubArray(nums);
    int max2 = total + sum;
    if(max2 == 0) return max1;
    return Math.max(max1,max2);
    
}
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int i =0;
        while(i<nums.length){
            cs += nums[i];
            ms = Math.max(ms,cs);
            if(cs<0) cs = 0;
            i++;
        }
        return ms;
    }
}