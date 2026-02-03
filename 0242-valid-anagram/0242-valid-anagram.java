class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq1 = new int[26];
        for(char ch:s.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2 = new int[26];
        for(char ch:t.toCharArray()){
            freq2[ch-'a']++;
        }
        
        return Arrays.equals(freq1,freq2);
    }
}