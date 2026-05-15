public class Solution {
    public IList<int> MajorityElement(int[] nums) {
        Dictionary<int,int> freq = new Dictionary<int,int>();
        foreach(int num in nums){
            if(freq.ContainsKey(num)) freq[num]++;
            else {
                freq[num] = 1;
            }
        }
        List<int> ans = new List<int>();
        foreach(var pair in freq){
            if(pair.Value>nums.Length/3){
                ans.Add(pair.Key);
            }
        }
        return ans;
    }
}