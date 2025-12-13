class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        int i=0;
        int j=0;
        String ans ="";
        while(n-->0){
            if(i<word1.length()){
                ans+=word1.charAt(i);
                i++;
            }
            if(j<word2.length()){
                ans+=word2.charAt(j);
                j++;
            }
        }
        return ans;
    }
}