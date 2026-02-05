class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq1 = new int[26];
        for(char ch:s.toCharArray()){
            freq1[ch-97]++;
        }
        int[] freq2 = new int[26];
        for(char ch:t.toCharArray()){
            freq2[ch-97]++;
        }
        
        return Arrays.equals(freq1,freq2);
    } 
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        for(int i=0;i<=s2.length()-n;i++){
            String s = s2.substring(i,i+n);
            if(isAnagram(s1,s)) return true;
        }
        return false;
    }
}