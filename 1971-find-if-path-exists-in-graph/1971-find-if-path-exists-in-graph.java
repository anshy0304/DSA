class Solution {

    public void dfs(ArrayList<ArrayList<Integer>> graph,int source,int destination,boolean visited[]){
       visited[source] = true;
       for(int i:graph.get(source)){
            if(!visited[i]){
                dfs(graph,i,destination,visited);
            }

       }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(graph,source,destination,visited);
        return visited[destination];
    }
}