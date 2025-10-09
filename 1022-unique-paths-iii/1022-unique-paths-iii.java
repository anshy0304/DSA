class Solution {
    int possible_ways = 0;
    void helper(int[][] grid,int row,int col,int count,int path_count){
        
        if(row < 0 || col < 0 || row>=grid.length || col>=grid[0].length || grid[row][col] == -1){
            
            return;
        }
        if(grid[row][col] == 2){
            if(path_count==count){
                possible_ways++;
            }
            
            return;
        }
        int temp = grid[row][col];
        grid[row][col] = -1;
        helper(grid,row+1,col,count,path_count+1);
        helper(grid,row-1,col,count,path_count+1);
        helper(grid,row,col+1,count,path_count+1);
        helper(grid,row,col-1,count,path_count+1);
        grid[row][col] = temp;
    }
    public int uniquePathsIII(int[][] grid) {
        int r = 0;
        int c = 0; 
        int count = 0;
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] != -1) count++;
                if(grid[i][j] == 1){
                    r = i;
                    c = j;
                }
            }
        }
        helper(grid,r,c,count,1);
        return possible_ways;

    }
}