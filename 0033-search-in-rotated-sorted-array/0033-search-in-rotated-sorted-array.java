class Solution {

    public int rotate(int[] nums,int target, int si, int ei) {
        if(si > ei) {
            return -1;
        }
        int mid = si + (ei - si)/2;
        if(nums[mid] == target) {
            return mid;
        }

        if(nums[mid]>= nums[si]) {
            if(target >= nums[si] && target <= nums[mid]) {
                return rotate(nums,target,si,mid-1);
            } else {
                return rotate(nums,target,mid+1,ei);
            }
        } else {
            if(target>=nums[mid] && target<=nums[ei]) {
                return rotate(nums,target,mid+1,ei);
            } else {
                return rotate(nums,target,si,mid-1);
            }
        }
    }
    public int search(int[] nums, int target) {
        return rotate(nums,target,0,nums.length-1);
    }
}