/// visit later

class Solution {

    long MOD = 1000000007L;
    int LOG;
    int[][] up;
    int[] depth;
    HashMap<Integer, ArrayList<Integer>> tree;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {

        int n = edges.length + 1;

        LOG = 1;
        while ((1 << LOG) <= n) {
            LOG++;
        }

        tree = new HashMap<>();

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            tree.putIfAbsent(u, new ArrayList<>());
            tree.putIfAbsent(v, new ArrayList<>());

            tree.get(u).add(v);
            tree.get(v).add(u);
        }

        up = new int[n + 1][LOG];
        depth = new int[n + 1];

        dfs(1, 0);

        for (int j = 1; j < LOG; j++) {

            for (int i = 1; i <= n; i++) {

                up[i][j] = up[up[i][j - 1]][j - 1];
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int u = queries[i][0];
            int v = queries[i][1];

            int ancestor = lca(u, v);

            int dist = depth[u] + depth[v]
                    - 2 * depth[ancestor];

            if (dist == 0) {
                ans[i] = 0;
            } else {
                ans[i] = (int) power(2, dist - 1);
            }
        }

        return ans;
    }

    private void dfs(int node, int parent) {

        up[node][0] = parent;

        if (!tree.containsKey(node)) return;

        for (int nei : tree.get(node)) {

            if (nei == parent) continue;

            depth[nei] = depth[node] + 1;

            dfs(nei, node);
        }
    }

    private int lca(int u, int v) {

        if (depth[u] < depth[v]) {

            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = LOG - 1; j >= 0; j--) {

            if ((diff & (1 << j)) != 0) {

                u = up[u][j];
            }
        }

        if (u == v) return u;

        for (int j = LOG - 1; j >= 0; j--) {

            if (up[u][j] != up[v][j]) {

                u = up[u][j];
                v = up[v][j];
            }
        }

        return up[u][0];
    }

    private long power(long base, long exp) {

        long ans = 1;

        while (exp > 0) {

            if ((exp & 1) == 1) {

                ans = (ans * base) % MOD;
            }

            base = (base * base) % MOD;

            exp >>= 1;
        }

        return ans;
    }
}