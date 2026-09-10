class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int mf = 0;
        int st = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            mf = Math.max(mf,freq[s.charAt(i) -'A']);
            while((i - st + 1) - mf> k){
                freq[s.charAt(st)-'A']--;
                st++;
            }
            max = Math.max(max,i-st+1);
        }
        return max;
    }
}