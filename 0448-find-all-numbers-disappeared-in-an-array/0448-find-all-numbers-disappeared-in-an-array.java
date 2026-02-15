class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i:nums) set.add(i);
        for(int i =1;i<=n;i++){
            if(set.contains(i)) continue;
            ans.add(i);
        }
        return ans;
    }   
}