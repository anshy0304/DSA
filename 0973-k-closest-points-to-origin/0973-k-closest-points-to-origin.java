class Solution {
    public int[][] kClosest(int[][] points, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[0]*b[0] + b[1]*b[1]) -(a[0]*a[0] + a[1]*a[1])
        );
        for(int[] pt:points) {
            pq.add(pt);
            if(pq.size()>k) pq.poll();
        }
        int[][] result = new int[k][2];
        for(int i=0;i<result.length;i++){
            result[i] = pq.poll();
        }
        return result;
    }
}