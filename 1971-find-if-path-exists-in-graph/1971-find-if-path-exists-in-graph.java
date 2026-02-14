class Solution {

    public void bfs(HashMap<Integer,List<Integer>> graph,int source,int destination,boolean visited[]){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int f=queue.poll();
            for(int nd:graph.getOrDefault(f,new ArrayList<>())){
                if(!visited[nd]){
                    queue.add(nd);
                    visited[nd] = true;
                }
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
        bfs(graph,source,destination,visited);
        return visited[destination];
    }
}