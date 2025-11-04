class Solution {
    public int candy(int[] r) {
        int[] arr = new int[r.length];
        Arrays.fill(arr,1);
        int sum = 0;
        for (int i = 1; i < r.length; i++) {
            if (r[i] > r[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }

        // Right to left
        for (int i = r.length - 2; i >= 0; i--) {
            if (r[i] > r[i + 1]) {
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }
}