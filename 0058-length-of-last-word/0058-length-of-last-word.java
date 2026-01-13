class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int val = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                val++;
            }else break;

        }
        return val;
    }
}