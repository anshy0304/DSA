class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[128];
        for(char ch:word.toCharArray()) freq[ch]++;
        int count = 0;
        for(int i=0;i<96;i++){
            if(freq[i] > 0 && freq[i+32] > 0) count++;
        }
        return count;
     }
}