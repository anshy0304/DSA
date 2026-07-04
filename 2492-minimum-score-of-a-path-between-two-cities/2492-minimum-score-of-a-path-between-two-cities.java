class Solution {
    public int minScore(int n, int[][] roads) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] road : roads) {
            int a = road[0];
            int b = road[1];
            int wt = road[2];
            graph.get(a).add(new int[] { b, wt });
            graph.get(b).add(new int[] { a, wt });
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        q.offer(1);
        visited[1] = true;

        int min = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int[] edge : graph.get(node)) {
                int next = edge[0];
                int wt = edge[1];

                min = Math.min(min, wt);

                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }

        return min;
    }
}