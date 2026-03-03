class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            graph.get(a).add(b);
        }
        int[] inorder = new int[n];
        for(int i=0;i<n;i++){
            for(int nbr:graph.get(i)){
                inorder[nbr]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inorder[i] == 0) q.add(i);
        }
        int[][] freq = new int[n][26];
        int max = 0;
        while(!q.isEmpty()){
            int f = q.poll();
            freq[f][colors.charAt(f)-'a']++;
            max = Math.max(max,freq[f][colors.charAt(f)-'a']);
            for(int nbr:graph.get(f)){
                inorder[nbr]--;
                if(inorder[nbr] == 0) q.add(nbr);

                for(int i=0;i<26;i++){
                    freq[nbr][i] = Math.max(freq[nbr][i],freq[f][i]);
                }
            }

        }
        for(int i:inorder) if(i>0) return -1;
        
        return max;
    }
}