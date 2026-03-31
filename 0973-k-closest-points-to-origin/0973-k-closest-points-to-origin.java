class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[0] - b[0]);

        for (int[] pt : points) {
            int dist = pt[0] * pt[0] + pt[1] * pt[1];
            pq.add(new int[] { dist, pt[0], pt[1] });
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < result.length; i++) {
            int x[] = pq.poll();
            result[i][0] = x[1];
            result[i][1]  = x[2];
        }
        return result;
    }
}