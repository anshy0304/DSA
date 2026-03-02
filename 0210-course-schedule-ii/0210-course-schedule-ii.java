class Solution {
    public int[] findOrder(int V, int[][] e) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<e.length;i++){
            int a = e[i][0];
            int b = e[i][1];
            graph.get(b).add(a);
        }
        int[] inorder = new int[V];
        for(int i=0;i<V;i++){
            for(int nbr:graph.get(i)){
                inorder[nbr]+=1;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inorder[i] == 0) q.add(i);
        }

        int[] ans = new int[V];
        int i = 0;
        while(!q.isEmpty()){
            int f = q.poll();
            ans[i] = f;
            for(int nbr:graph.get(f)){
                inorder[nbr]--;
                if(inorder[nbr] == 0) q.add(nbr);
            }
            i++;
        }
        if(i != V) return new int[]{};
        return ans;
     }
}