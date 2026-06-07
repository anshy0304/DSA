class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        for(char ch:s.toCharArray()){
            total += ch;
        }
        for(char ch:t.toCharArray()){
            total -= ch;
        }
        return (char)(-total);
    }

}