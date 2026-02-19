class Solution {

   public void dfs(HashMap<Integer,ArrayList<Integer>> graph,int source,int destination,boolean[] visited){
        visited[source] = true;
        for(int nbr:graph.get(source)){
            if(!visited[nbr]){
            dfs(graph,nbr,destination,visited);
            }   
        }
   }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
       HashMap<Integer,ArrayList<Integer>> graph = new HashMap<>();
       for(int i=0;i<n;i++){
        graph.put(i,new ArrayList<>());
       }
       for(int i=0;i<edges.length;i++){
        int a = edges[i][0];
        int b = edges[i][1];
        graph.get(a).add(b);
        graph.get(b).add(a);
       }
       boolean visited[]= new boolean[n];
       dfs(graph,source,destination,visited);
       return visited[destination];
    }
}