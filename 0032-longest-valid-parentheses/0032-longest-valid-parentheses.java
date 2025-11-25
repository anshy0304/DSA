class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // char[] arr = s.toCharArray();
        // for(int i = arr.length-1;i>=0;i--){
        //     st.push(arr[i]);
        // }
        // Stack<Character> temp = new  Stack<>();
        // int count = 0;
        // while(!st.isEmpty()){
        //     char ch = st.pop();
        //     if(!st.isEmpty()){
        //         char sh = st.pop();
        //         if(ch == '(' && sh == ')'){
        //         count += 2;
        //         }else{
        //             st.push(sh);
        //             temp.push(ch);
        //         }
        //     }else temp.push(ch);
        // }
        // while(!temp.isEmpty()){
        //     char ch = temp.pop();
        //     if(!temp.isEmpty()){
        //         char sh = temp.pop();
        //         if(ch == ')' && sh == '('){
        //         count += 2;
        //         }else{
        //             temp.push(sh);
        //         }
        //     }
        // }
        // return count;

        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max  =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else {
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }else {
                    max = Math.max(max,i - st.peek());
                }
            }
        }
        return max;

    }
}