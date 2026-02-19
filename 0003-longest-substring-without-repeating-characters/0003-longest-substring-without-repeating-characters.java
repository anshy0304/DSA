class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length(); 
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int st = 0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(st));
                st++;
            }
            set.add(s.charAt(i));
            max = Math.max(max,set.size());
        }
             return max;
        }
       
    }
