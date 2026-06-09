class Solution {
    public void helper(List<List<Integer>> ans,List<Integer> num,int n,int k,int start){
        if(num.size() == k){
            ans.add(new ArrayList<>(num));
            return;
        }
        if(start > n) return;
        helper(ans,num,n,k,start +1);
        num.add(start);
        helper(ans,num,n,k,start+1);
        num.remove(num.size()-1);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        helper(ans,num,n,k,1);
        return ans;
    }
}