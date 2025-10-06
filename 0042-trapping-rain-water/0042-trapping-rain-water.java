class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        } else {
            int max_left[] = new int[height.length];
            int max_right[] = new int[height.length];
            int waterlevel = 0;
            max_left[0] = height[0];
            for (int i = 1; i < height.length; i++) {
                max_left[i] = Math.max(height[i], max_left[i - 1]);
            }
            max_right[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                max_right[i] = Math.max(height[i], max_right[i + 1]);
            }
            int trapped_water = 0;
            for (int i = 0; i < n; i++) {
                waterlevel = Math.min(max_right[i], max_left[i]);
                trapped_water += waterlevel - height[i];
            }

            return trapped_water;
        }
    }
}