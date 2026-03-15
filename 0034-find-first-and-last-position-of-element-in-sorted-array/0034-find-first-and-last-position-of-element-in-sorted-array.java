class Solution {
   

    public int[] searchRange(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;
        int left = -1;
        int right = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                left  = mid;
                end = mid-1;
            }else if(nums[mid] > target) end = mid-1;
            else st = mid+1;
        }
        st = 0;
        end = nums.length-1;
         while(st<=end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                right  = mid;
                st = mid+1;
            }else if(nums[mid] > target) end = mid-1;
            else st = mid+1;
        }
        return new int[]{left,right};
    }
}