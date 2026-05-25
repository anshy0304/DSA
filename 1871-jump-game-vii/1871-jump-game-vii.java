class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) != '0')
            return false;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int i = 0;
        while (!q.isEmpty()) {
            int f = q.poll();
            if(f == n-1) return true;
            int start = Math.max(f+minJump,i+1);
            int end = Math.min(f+maxJump,n-1);
            for(int j=start;j<=end;j++){
                if(s.charAt(j) == '0' && !visited[j]){
                    visited[j] = true;
                    q.add(j);
                }
            }
            i = end;
        }
        return false;
    }
}