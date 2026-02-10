class Solution {
    public void helper(int n, List<String> ans,int open,int close,String per){
        if(open == 0 && close == 0){
            ans.add(per);
            return;
        }
        if(open != 0) helper(n,ans,open-1,close,per+'(');
        if(open<close) {
            
            
            helper(n,ans,open,close-1,per + ')');
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n-1;
        int close = n;
        String per = "(";
        helper(n,ans,open,close,per);
        return ans;
    }
}