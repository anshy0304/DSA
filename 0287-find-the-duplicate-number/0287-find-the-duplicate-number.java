class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        
        for(int ele:nums){
            if(!set.contains(ele)){
                set.add(ele);
            }else{
                return ele;
            }
        }
        return -1;
    }
}