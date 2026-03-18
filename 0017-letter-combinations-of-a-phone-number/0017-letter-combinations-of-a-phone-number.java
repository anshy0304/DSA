class Solution {
    public void helper(String[] a,List<String> ans,int in,String digits,StringBuilder temp){
        if(in == digits.length()){
            ans.add(temp.toString());
            return;
        }
        String letter = a[digits.charAt(in)-'0'];
        int len = temp.length();
        for(int i=0;i<letter.length();i++){
            temp.append(letter.charAt(i));
            helper(a,ans,in+1,digits,temp);
            temp.setLength(len);
        }


    }

    public List<String> letterCombinations(String digits) {
        String[] a = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        helper(a,ans,0,digits,temp);
        return ans;
    }
}