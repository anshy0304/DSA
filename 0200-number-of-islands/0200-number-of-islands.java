class Solution {
    public void clear(char[][] grid ,int i, int j){
        if(j >= grid[0].length || i >= grid.length || j < 0 || i < 0) return;
        if(grid[i][j] == '0' ) return;
        grid[i][j] ='0'; 
        clear(grid,i-1,j);
        clear(grid,i+1,j);
        clear(grid,i,j+1);
       
        clear(grid,i,j-1);
        
        
        
    }
    public int numIslands(char[][] grid) {
        //ASCII ->  1 -> 49 || 0 -> 48
        int num = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1') {
                    num++;
                    clear(grid,i,j);
                }
            }
        }
        return num;
    }
}