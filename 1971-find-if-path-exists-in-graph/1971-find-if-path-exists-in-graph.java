class Solution {

    public void bfs(ArrayList<ArrayList<Integer>> graph,int source,int destination,boolean visited[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int f = queue.poll();
            for(int nd:graph.get(f)){
                if(!visited[nd]){
                    queue.add(nd);
                    visited[nd] = true;
                }
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
        bfs(graph,source,destination,visited);
        return visited[destination];
    }
}