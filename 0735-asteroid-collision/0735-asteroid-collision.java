class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        st.push(asteroids[0]);
        for(int i=1;i<asteroids.length;i++){
            if(!st.isEmpty() && st.peek() > 0 && asteroids[i] < 0){
                while(!st.isEmpty()  && st.peek()> 0 && st.peek() < (asteroids[i] * - 1)){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == (asteroids[i]*-1)){
                st.pop();
                }
                else if(st.isEmpty() || st.peek() < 0){
                st.push(asteroids[i]);
                }
            }
            else st.push(asteroids[i]);

            // else if(st.peek() < 0 && asteroids[i] > 0){
            //     while(!st.isEmpty() || (st.peek() * -1) < asteroids[i] ){
            //         st.pop();
            //     }
            //     if(st.size() == 0 || st.peek() > 0){
            //         st.push(asteroids[i]);
            //     }
            } int[] ans = new int[st.size()];
            for(int i=ans.length-1;i>=0;i--){
                ans[i] = st.pop();
            }
                return ans;
        }
       
    }

