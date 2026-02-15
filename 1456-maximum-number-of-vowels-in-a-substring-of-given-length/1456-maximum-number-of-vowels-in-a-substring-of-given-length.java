class Solution {
    int count = 0;
    public void checker(int[] freq1,int[] freq2){
        int curr = 0;
        for(int i=0;i<26;i++){
          
            if(freq1[i] == 1 && freq2[i] >= 1)curr+=freq2[i];
        }
        count = Math.max(curr,count);
    }


    public int maxVowels(String s, int k) {
        String vowel = "aeiou";
        int freq1[] = new int[26];
        for(char ch:vowel.toCharArray()) freq1[ch-'a']++;
        int freq2[] = new int[26];
        int window = k;
        for(int i=0;i<window;i++){
            freq2[s.charAt(i)-'a']++;
        }
        checker(freq1,freq2);
        for(int i=window;i<s.length();i++){
            freq2[s.charAt(i) -'a']++;
            freq2[s.charAt(i-window)-'a']--;
            checker(freq1,freq2);
        }
        return count;

     }
}