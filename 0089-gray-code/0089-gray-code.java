class Solution {
    void helper(int n,List<Integer> ans, Set<Integer> seen){
        if(ans.size() == (int)Math.pow(2,n)){
            return;
        }
        int last = ans.get(ans.size()-1);
        for(int i = 0;i<n;i++){
            int num = last^(int)Math.pow(2,i);
            if(seen.contains(num)) continue;
            ans.add(num);
            seen.add(num);
            helper(n,ans,seen);
            
                
        }
       
        
    }
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        ans.add(0);
        seen.add(0);
        helper(n,ans,seen);
        return ans;
    }
}