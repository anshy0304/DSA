class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > n/2) return entry.getKey();
        }
        return -1;
    }
}