class Solution {

    public void helper(String s,List<String> ans,int in,String per){
        if(in == s.length()){
            ans.add(per);
            per = "";
            return;
        }
        char ch = s.charAt(in);
        if(Character.isLetter(ch)){
            helper(s,ans,in+1,per + Character.toUpperCase(ch));
            helper(s,ans,in+1,per+ Character.toLowerCase(ch));
        }else {
            helper(s,ans,in+1,per+ch);
        }
        
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans= new ArrayList<>();
        String per = "";
        helper(s,ans,0,per);
        return ans;
    }
}