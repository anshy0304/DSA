class Solution {

    public int dfs(int source,HashMap<Integer,ArrayList<Integer>> map,int[] dp){
        if(dp[source] != 0) return dp[source];
        int count = 1;
        for(int nbr:map.get(source)){
            
                count = Math.max(count,1+dfs(nbr,map,dp));
            
        }
        dp[source] = count;
         return dp[source];
    }

    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
           for(int j = i+1;j<=i+d;j++){
            if(j < n ){
                if(arr[j]>=arr[i]) break;
                map.get(i).add(j);
            }
           }
           for(int j= i-1;j>=i-d;j--){
            if(j >= 0 ){
                 if(arr[j]>=arr[i]) break;
                map.get(i).add(j);
            }
           }
        }
        int ans = 0;
        int[] dp = new int[n];
        for(int i=0;i<n;i++){
            ans = Math.max(ans,dfs(i,map,dp));
        }
        return ans;
    }
}