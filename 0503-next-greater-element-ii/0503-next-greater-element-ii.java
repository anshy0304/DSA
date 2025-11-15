class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        arr[arr.length - 1] = -1;
        Stack<Integer> st = new Stack<>();
        for(int i=2*nums.length-1;i>=0;i--){
            int index = i % nums.length;
            while(!st.isEmpty() && st.peek() <= nums[index]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[index] = -1;

            }else{
                arr[index] = st.peek();
            }
            st.push(nums[index]);
        }

        return arr;
    }
}