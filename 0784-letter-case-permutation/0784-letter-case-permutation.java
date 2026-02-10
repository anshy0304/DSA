class Solution {

    public void helper(String s,List<String> ans,int in,StringBuilder per){
        if(in == s.length()){
            ans.add(per.toString());
            return;
        }
        char ch = s.charAt(in);
        int len = per.length();
        if(Character.isLetter(ch)){
            per.append(Character.toUpperCase(ch));
            helper(s,ans,in+1,per);
            per.setLength(len);

            per.append(Character.toLowerCase(ch));
            helper(s,ans,in+1,per);
            per.setLength(len);
        }else {
            per.append(ch);
            helper(s,ans,in+1,per);
            per.setLength(len);
        }
        
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans= new ArrayList<>();
        StringBuilder per = new StringBuilder();
        helper(s,ans,0,per);
        return ans;
    }
}