class Solution {
    public int check(int [] nums,int mid){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res += Math.ceil((double)nums[i]/mid);
        }
        return res;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int st = 1;
        int end = 0;
        for(int i:nums) end = Math.max(end,i);
        int ans = end;
        while(st<=end){
            int mid = st + (end-st)/2;
            int res = check(nums,mid);
            if(res <= threshold) {ans = mid;end = mid-1;}
            if(res > threshold){
                st = mid+1;
            }else end = mid-1;
        }
        return ans;
    }
}