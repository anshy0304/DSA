class Solution {
    public int sum(int[] sum,int si,int ei) {
        int add = 0;
        for(int i =si;i<=ei;i++){
            add += sum[i];
        }
        return add;
    }
    public int pivotIndex(int[] nums) {
        for(int i =0;i<nums.length;i++) {
            int left = sum(nums,0,i-1);
            int right = sum(nums,i+1,nums.length-1);
            if(right == left) return i;
        }
        return -1;
        
       
        
    }
}