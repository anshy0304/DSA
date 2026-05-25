class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');

            }else if(ch == '['){
                count.push(num);
                st.push(curr);
                num = 0;
                curr = new StringBuilder();
            }else if(ch == ']'){
                int j = count.pop();
                StringBuilder temp  = st.pop();
                for(int i=0;i<j;i++){
                    temp.append(curr);
                }
                curr = temp;
            }else curr.append(ch);
        }
        return curr.toString();
    }
}