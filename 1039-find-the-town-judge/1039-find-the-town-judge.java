class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            ans.add(i);
        }
        for(int i=0;i<trust.length;i++){
            int a=trust[i][0];
            ans.remove(Integer.valueOf(a));
        }
        if(ans.isEmpty()){
            return -1;
        }
        int candidate = ans.get(0);
        int count = 0;
        for(int i =0;i<trust.length;i++){
            if(trust[i][1] == candidate) count++;
        }
        if(count == n-1) return candidate;
    
        return -1;
    }
}