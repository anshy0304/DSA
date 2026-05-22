class Solution {
    public int binary(int st,int end,int[] nums,int target){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid-1;
            else st = mid+1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        if(nums[0] < nums[nums.length-1]) return binary(0,nums.length-1, nums,target);
        int pivot = 0;
        int st = 0;
        int end = nums.length-1;
        int n = nums.length;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid] == target) return mid;
            int prev = (mid-1+n)%n;
            int next = (mid+1)%n;
            if(nums[mid] < nums[prev] && nums[mid] < nums[next]) {
                pivot = mid;
                break;
            }else if(nums[mid] >= nums[0]) st = mid+1;
            else end = mid -1 ;
        }
        int left = binary(0,pivot-1,nums,target);
        if(left != -1) return left;
        return binary(pivot,n-1,nums,target);
    }
}