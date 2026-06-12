class Solution {
    int depth = 0;

    public void dfs(HashMap<Integer, ArrayList<Integer>> tree, int node, int parent, int d) {
        depth = Math.max(depth, d);

        for (int nbr : tree.getOrDefault(node, new ArrayList<>())) {
            if (nbr == parent) continue;
            dfs(tree, nbr, node, d + 1);
        }
    }

    public int assignEdgeWeights(int[][] edges) {
        HashMap<Integer, ArrayList<Integer>> tree = new HashMap<>();

        for (int[] e : edges) {
            int a = e[0], b = e[1];

            tree.putIfAbsent(a, new ArrayList<>());
            tree.putIfAbsent(b, new ArrayList<>());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        dfs(tree, 1, -1, 0);

        if (depth == 0) return 0;

        long mod = 1_000_000_007;
        long ans = 1;
        long base = 2;
        int exp = depth - 1;

        while (exp > 0) {
            if ((exp & 1) == 1) ans = (ans * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }

        return (int) ans;
    }
}