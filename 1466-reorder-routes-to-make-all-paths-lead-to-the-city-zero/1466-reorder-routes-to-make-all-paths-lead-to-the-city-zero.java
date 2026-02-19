class Solution {

    public void dfs(int node,List<List<Integer>> frwrd,List<List<Integer>> bkwrd,int[] ans,int[] visited){
        visited[node] = 1;
        for(int nbr:frwrd.get(node)){
            if(visited[nbr] == 0) {
                ans[0]+= 1;
                dfs(nbr,frwrd,bkwrd,ans,visited);
            }
        }
        for(int nbr:bkwrd.get(node)){
            if(visited[nbr] == 0){
                dfs(nbr,frwrd,bkwrd,ans,visited);
            }
        }
    }
  

    public int minReorder(int n, int[][] connections) {
       List<List<Integer>> frwrd = new ArrayList<>();
       List<List<Integer>> bkwrd  = new ArrayList<>();
       for(int i=0;i<n;i++){
        frwrd.add(new ArrayList<>());
        bkwrd.add(new ArrayList<>());
       }
       for(int i=0;i<connections.length;i++){
            int a = connections[i][0];
            int b = connections[i][1];
            frwrd.get(a).add(b);
            bkwrd.get(b).add(a);
       }
       int[] visited = new int[n];
       int[] ans = new int[1];
       dfs(0,frwrd,bkwrd,ans,visited);
       return ans[0];
    }
}