class Solution {

    public void dfs(int[][] graph,List<List<Integer>> ans,List<Integer> path,int source,int n){
        
        path.add(source);
        if(source == n) {ans.add(new ArrayList<>(path));}
        for(int nbr:graph[source]){
            dfs(graph,ans,path,nbr,n);
        }
        path.remove(path.size()-1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans  = new ArrayList<>();
        dfs(graph,ans,path,0,graph.length-1);
        return ans;
    }
}