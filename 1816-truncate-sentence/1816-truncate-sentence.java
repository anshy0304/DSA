class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(str[i]).append(" ");
        }

        
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
