class Solution {

    public void dfs(HashMap<Integer,List<Integer>> graph,int source,int destination,boolean visited[]){

        visited[source] = true;
        for(int nd:graph.getOrDefault(source, new ArrayList<>())){
            if(!visited[nd]){
                dfs(graph,nd,destination,visited);
            }
        }

    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge:edges){
            int a = edge[0];
            int b = edge[1];

            graph.computeIfAbsent(a,k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b,k -> new ArrayList<>()).add(a);
        }
        boolean visited[] = new boolean[n];
        dfs(graph,source,destination,visited);
        return visited[destination];
    }
}