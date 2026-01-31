class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        
        int count = 1;
        int curr = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i] != nums[i+1]-1){
                count = Math.max(count,curr);
                curr = 1;
            }
            if(nums[i] == nums[i+1]-1){
                curr++;
            }
            
            
            
        }
        count = Math.max(count,curr);
        return count;
    }
}