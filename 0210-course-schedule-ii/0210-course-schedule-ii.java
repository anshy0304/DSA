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
        int in[] = new int[V];
        for(int i=0;i<V;i++){
            for(int nbr:graph.get(i)){
                in[nbr]+=1;
            }
        }
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i=0;i<V;i++){
            if(in[i] == 0) que.add(i);
        }
        int ans[] = new int[V];
        int j = 0;
        while(!que.isEmpty()){
            int source = que.poll();
            ans[j] = source;
            j++;
            for(int num:graph.get(source)){
                in[num]--;
                if(in[num] == 0) que.add(num);
            }
        }
        for(int i=0;i<V;i++){
            if(in[i] != 0) return new int[]{};
        }
        return ans;
    }
}