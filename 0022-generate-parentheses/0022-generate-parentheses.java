class Solution {
    public void helper(int n, List<String> ans,int open,int close,StringBuilder per){
        if(open == 0 && close == 0){
            ans.add(per.toString());
            return;
        }
        int len = per.length();
        if(open != 0){ helper(n,ans,open-1,close,per.append('('));per.setLength(len);}
        if(open<close) {
            
            
            helper(n,ans,open,close-1,per.append(')'));
            per.setLength(len);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n-1;
        int close = n;
        StringBuilder per = new StringBuilder("(");
        helper(n,ans,open,close,per);
        return ans;
    }
}