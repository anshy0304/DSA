class Solution {
    public int mah(int arr[]) {
        int n = arr.length;
        int[] nsr= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = n;
            }else nsr[i] = st.peek();
            st.push(i);
        }
        st.clear();
        int[] nsl = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) nsl[i] = -1;
            else nsl[i] = st.peek();
            st.push(i);
        }
         int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] arr = new int[rows][cols];
        int max = 0;

        for (int j = 0; j < cols; j++) {
            arr[0][j] = matrix[0][j] == '1' ? 1 : 0;
        }

        max = mah(arr[0]);

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '0') {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i - 1][j] + 1;
                }
            }
            max = Math.max(max, mah(arr[i]));
        }

        return max;
    }
}