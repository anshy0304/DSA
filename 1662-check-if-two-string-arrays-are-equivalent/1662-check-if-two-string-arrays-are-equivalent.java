class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for(String ch:word1){
            s1.append(ch);
        }
        StringBuilder s2 = new StringBuilder();
        for(String ch:word2){
            s2.append(ch);
        }
        return s1.toString().equals(s2.toString());
    }
}