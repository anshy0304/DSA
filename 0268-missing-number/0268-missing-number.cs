public class Solution {
    public int MissingNumber(int[] nums) {
        int ans = 0;
        int total = 0;
        for(int i=0;i<=nums.Length;i++)total+=i;
        foreach(int i in nums) ans+= i;
        return total-ans;
    }
}