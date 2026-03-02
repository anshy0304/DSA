class Solution {
    int max = -1;
    public void dfs(int[] graph,boolean[] visited,int[] cp,int source,int counter){
        visited[source] = true;
        cp[source] = counter;
        int nbr = graph[source];
        if(nbr != -1){
            if(!visited[nbr]){
               dfs(graph,visited,cp,nbr,counter+1);
            }else if(cp[nbr] > 0) {
                max  = Math.max(max,cp[source]  - cp[nbr]+1);
            }
        }
        cp[source] = 0;
    }
    public int longestCycle(int[] edges) {
        boolean visited[] = new boolean[edges.length];
        int cp[] = new int[edges.length];
        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                dfs(edges,visited,cp,i,0);
            
            }
        }
        return max;
    }
}