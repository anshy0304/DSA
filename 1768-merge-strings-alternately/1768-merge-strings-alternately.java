class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        int i=0;
        int j=0;
        StringBuilder ans =new StringBuilder();
        while(n-->0){
            if(i<word1.length()){
                ans.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                ans.append(word2.charAt(j));
                j++;
            }
        }
        return ans.toString();
    }
}