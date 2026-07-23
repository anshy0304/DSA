class NumArray {
    public int[] arr;
    public int[] temp;
    public NumArray(int[] nums) {
        arr = nums;
        temp = new int[arr.length +1];
        for(int i=0;i<arr.length;i++){
            temp[i+1] = temp[i] + arr[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return temp[right + 1] - temp[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */