class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxr = new int[n];
        int[] maxl = new int[n];
        maxl[0] = height[0];
        for(int i=1;i<n;i++){
            maxl[i] = Math.max(height[i],maxl[i-1]);
        }
        maxr[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxr[i] = Math.max(maxr[i+1],height[i]);
        }
        int water = 0;
        for(int i=0;i<n;i++){
            water += Math.min(maxr[i],maxl[i])-height[i];
        }
        return water;
    }
}