class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Arrays.sort(nums);
       HashMap<Integer,Integer> map = new HashMap<>();
       int n= nums.length;
       for(int i:nums)map.put(i,map.getOrDefault(i,0)+1);
       List<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue() > n/3) list.add(entry.getKey());
       }
       return list;
    }
}