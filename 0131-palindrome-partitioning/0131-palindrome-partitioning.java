class Solution {
    public boolean palindrome(String s){
        int i = 0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public void helper(String s,List<List<String>> result,List<String> list,int in){
        if(in == s.length()) {
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=in;i<s.length();i++){
            String temp = s.substring(in,i+1);

            if(palindrome(temp.toString())){
                list.add(temp.toString());
                helper(s,result,list,i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> list = new ArrayList<>();
        helper(s,result,list,0);
        return result;

    }
}