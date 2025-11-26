class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty()) {
                char top = st.peek();

                
                if ((top == 'A' && c == 'B') ||
                    (top == 'C' && c == 'D')) {
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }

        return st.size();
    }
}
