class Solution {
    
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length/2];
        int arr1[] = new int[nums.length/2];
        int j = 0;
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                arr[j] = nums[i];
                j++;
            }else {
                arr1[k] = nums[i];
                k++;
            }
        }
        j = 0;
        k = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%2 != 0) {
                nums[i] = arr1[k];
                k++;
            }else {
                nums[i] = arr[j];
                j++;
            }
        }
        return nums;
    }
}