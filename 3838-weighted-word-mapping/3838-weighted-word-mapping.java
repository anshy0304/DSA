class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String st:words){
            int sum = 0;
            for(char ch:st.toCharArray()){
                sum += weights[ch-'a'];
            }
            sum = sum % 26;
            ans.append((char)('z' - sum));
        }
        return ans.toString();
    }
}