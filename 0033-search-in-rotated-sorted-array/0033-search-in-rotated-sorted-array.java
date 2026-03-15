class Solution {

    public int peak(int[] arr){
    int st = 0;
    int end= arr.length-1;
        while(st<=end){
            if(arr[st] <= arr[end]) return st;
            int mid = st+(end-st)/2;
            int prev = (mid-1+arr.length)%arr.length;
            int next =  (mid+1)%arr.length;
            if(arr[mid] < arr[prev] && arr[mid] < arr[next]) return mid;
            if(arr[mid] >= arr[st]) st = mid+1;
            else end = mid-1;
        }
            return 0;
    }
    
    public int binary(int[] nums,int st ,int end,int target){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) end = mid -1;
            else st = mid+1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length == 1) return (nums[0] == target)?0:-1;
        int pk = peak(nums);
        System.out.print(pk);
        if(nums[pk] == target) return pk;
        int left = binary(nums,0,pk-1,target);
        if(left != -1) return left;
        return binary(nums,pk+1,nums.length-1,target);
        
    }
}