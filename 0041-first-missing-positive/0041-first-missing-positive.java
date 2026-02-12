class Solution {
    public int firstMissingPositive(int[] nums) {
       
        HashSet<Integer> set = new HashSet<>();
        int max = nums.length;
        for(int i:nums){ 
            set.add(i);
            max = Math.max(max,i);
        
        }
        
        for(int i=1;i<=Integer.MAX_VALUE;i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}