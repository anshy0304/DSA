class Solution {

    public void dfs(int[][] image, int sr, int sc, int oldColor, int newColor) {

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
            return;

        if(image[sr][sc] != oldColor)
            return;

        image[sr][sc] = newColor;

        dfs(image, sr+1, sc, oldColor, newColor);
        dfs(image, sr-1, sc, oldColor, newColor);
        dfs(image, sr, sc+1, oldColor, newColor);
        dfs(image, sr, sc-1, oldColor, newColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor = image[sr][sc];

        if(oldColor == color) return image;

        dfs(image, sr, sc, oldColor, color);

        return image;
    }
}