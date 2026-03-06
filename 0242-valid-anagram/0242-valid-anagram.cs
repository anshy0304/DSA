public class Solution {
    public bool IsAnagram(string s, string t) {
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        foreach(char ch in s) freq[ch-'a']++;
        foreach(char ch in t) freq2[ch-'a']++;
        return freq.SequenceEqual(freq2);
     }
}