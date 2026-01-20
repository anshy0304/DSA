class Solution {
    public int findFirst(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int l = -1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                l = mid;
                right = mid -1;
            }else if(target > nums[mid]) left = mid+1;
            else right = mid -1;
        }
        return l;
    }

    public int findLast(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int r = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                r = mid;
                left = mid + 1;
            }else if(target > nums[mid]) left = mid+1;
            else right = mid -1;
        }
        return r;
    }

    public int[] searchRange(int[] nums, int target) {
        int f = findFirst(nums,target);
        int l = findLast(nums,target);
        return new int[] {f,l};
    }
}