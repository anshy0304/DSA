class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length(); 
        int freq[] = new int[256];
        int max = 0;
        int st = 0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
            while(freq[s.charAt(i)] > 1){
                char ch = s.charAt(st);
                freq[ch]--;
                st++;

            }max = Math.max(max,i-st+1);
        }
             return max;
        }
       
    }
