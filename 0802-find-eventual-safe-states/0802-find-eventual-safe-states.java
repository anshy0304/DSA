class Solution {

    public boolean dfs(int[][] graph,boolean[] visited,boolean[] cp,int source){
        visited[source] = true;
        cp[source] = true;
        for(int nbr:graph[source]){
            if(!visited[nbr]){
               if( dfs(graph,visited,cp,nbr)) return true;
            }else if(cp[nbr] == true) return true;
        }
        cp[source] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean visited[] = new boolean[graph.length];
        boolean cp[] = new boolean[graph.length];
        List<Integer> ans = new ArrayList<>();
        for(int i= 0;i<graph.length;i++){
            if(!visited[i]){
                dfs(graph,visited,cp,i);
                
            }
        }
        for(int i=0;i<cp.length;i++){
            if(!cp[i]) ans.add(i);
        }
        return ans;
    }
}