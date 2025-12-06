class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int arr1[] = new int[grid.length];
        int arr2[] = new int[grid.length];
        for(int i=0;i<arr1.length;i++){
            for(int  j=0;j<arr2.length;j++){
                arr1[i] = Math.max(arr1[i],grid[i][j]);
                arr2[j] = Math.max(arr2[j],grid[i][j]);
            }
        }

        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                int diff = Math.min(arr1[i],arr2[j]);
                ans+= diff - grid[i][j];
            }
        }
        return ans;
    }
}