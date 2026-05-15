public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> map = new Dictionary<int,int>();
        foreach(int num in nums) {
           map[num] = map.GetValueOrDefault(num,0)+1;
        }
        foreach(KeyValuePair<int, int>  pair in map){
            if(pair.Value  > nums.Length/2){
                return pair.Key;
            }
        }
        return -1;
    }
}