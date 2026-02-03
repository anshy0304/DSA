class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // Top
            for (int i = startcol; i <= endcol; i++) {
                ans.add(matrix[startrow][i]);
            }
            startrow++;

            // Right
            for (int i = startrow; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }
            endcol--;

            // Bottom
            if (startrow <= endrow) {
                for (int i = endcol; i >= startcol; i--) {
                    ans.add(matrix[endrow][i]);
                }
                endrow--;
            }

            // Bottom to up (Left)
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    ans.add(matrix[i][startcol]);
                }
                startcol++;
            }
        }

        return ans;
    }
}