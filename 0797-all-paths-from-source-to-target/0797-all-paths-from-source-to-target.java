class Solution {

    public void dfs(int[][] graph,List<List<Integer>> ans,List<Integer> path,int source,int n, boolean visited[]){
        
        path.add(source);
        if(source == n) {ans.add(new ArrayList<>(path));}
        visited[source] = true;
        for(int nbr:graph[source]){
            
            if(!visited[nbr]){
                dfs(graph,ans,path,nbr,n,visited);
            }
        }
        visited[source] = false;
        path.remove(path.size()-1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans  = new ArrayList<>();
        boolean visited[] = new boolean[graph.length];
        dfs(graph,ans,path,0,graph.length-1,visited);
        return ans;
    }
}