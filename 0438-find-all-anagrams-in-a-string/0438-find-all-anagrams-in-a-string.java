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
        int n = p.length();
        for(int i=0;i<=s.length()-n;i++){
            String sub = s.substring(i,i+n);
            if(isAnagram(p,sub)){
                ans.add(i);
            }
        }
        return ans;
    }
}