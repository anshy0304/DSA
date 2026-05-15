public class Solution {
    public bool IsAnagram(string s, string t) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        foreach(var ch in s){
            freqS[ch-'a']++;
        }
        foreach(var ch in t){
            freqT[ch-'a']++;
        }
        return freqS.SequenceEqual(freqT);
    }
}