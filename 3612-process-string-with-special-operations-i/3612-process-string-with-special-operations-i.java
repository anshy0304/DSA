class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                ans.append(ch);
            else if (ch == '#')
                ans.append(ans);
            else if (ch == '%')
                ans.reverse();
            else {
                if (ans.length() > 0) {
                    ans.setLength(ans.length() - 1);
                }
            }
        }
        return ans.toString();
    }
}