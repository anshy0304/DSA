class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
       int[] freq1 = new int[26];
       int[] freq2 = new int[26];
       for(char ch:p.toCharArray())freq1[ch-'a']++;
        if(p.length() > s.length()) return ans;
       int window = p.length();
       for(int i=0;i<window;i++){
        freq2[s.charAt(i)-'a']++;
       }
        
        if(Arrays.equals(freq1,freq2)) ans.add(0);
       for(int i=window;i<s.length();i++){
        freq2[s.charAt(i)-'a']++;
        freq2[s.charAt(i-window)-'a']--;
        if(Arrays.equals(freq1,freq2)) ans.add(i-window+1);
       }
       return ans;
    }
}