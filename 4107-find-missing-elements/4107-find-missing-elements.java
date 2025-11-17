class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int i = nums[0];
        int j = 0;
        while(i<=nums[nums.length-1]){
            if(j < nums.length && nums[j] == i) {
                j++;
                i++;
                
            }else {
                list.add(i);
                i++;
            }
        }
        return list;
    }
}