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
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()) return ans;
        int window = p.length();
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(char ch:p.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<window;i++){
            freq2[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(freq1,freq2)) ans.add(0);
        for(int i=window;i<s.length();i++){
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-window) - 'a']--;
            if(Arrays.equals(freq1,freq2)) ans.add(i-window+1);
        }

        return ans;
    }
}