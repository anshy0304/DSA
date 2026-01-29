
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > nums.length/2 ) ans = entry.getKey();
        }
        return ans;
    }
}