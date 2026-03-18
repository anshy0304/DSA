class Solution {
    public void helper(String[] a,List<String> ans,int in,String digits,String s){
        if(in == digits.length()){
            ans.add(s);
            return;
        }
        String letter = a[digits.charAt(in)-'0'];
        for(int i=0;i<letter.length();i++){
            helper(a,ans,in+1,digits,s+letter.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        String[] a = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        helper(a,ans,0,digits,"");
        return ans;
    }
}