import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        if(t.length() == 1){
            if(s.contains(t)) return t;
            return "";

        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        int st = 0;
        for(char ch:t.toCharArray()) freq1[ch]++;
        int match=0;
        String ansh = "";
        int min = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq1[ch]--;
            if(freq1[ch]>=0) match++;
            while(match == t.length()){
                if(i-st+1<min){
                    min = i-st+1;
                    ansh = s.substring(st,i+1);
                }
                freq1[s.charAt(st)]++;
                if(freq1[s.charAt(st)] > 0) match--;
                st++;

            }
            
        }
        return ansh;
    }
}