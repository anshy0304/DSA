class Solution {
    int max = 0;
    void helper(int[][] grid,int row,int col,int curr){
        
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == 0){
            max = Math.max(curr,max);
            return;
        }
        int temp = grid[row][col];
        grid[row][col] = 0;
        helper(grid,row+1,col,curr+temp);
        helper(grid,row-1,col,curr+temp);
        helper(grid,row,col-1,curr+temp);
        helper(grid,row,col+1,curr+temp);
        grid[row][col] = temp;
         

    }
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int curr = 0;
        
        for(int i =0;i<n;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                    helper(grid,i,j,curr);
                }
            }
        }
        return max;
    }
}