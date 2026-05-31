class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums1)set.add(num);
        for(int num : nums2){
            if(set.contains(num)) {
                min = Math.min(min,num);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}