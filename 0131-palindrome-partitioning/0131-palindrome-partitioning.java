class Solution {
    public boolean isPalindrome(String p){
        
        int i=0;
        int n = p.length()-1;
        while(i<n){
            if(p.charAt(i)!=p.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public void helper(String s,List<List<String>> result,List<String> list,int index){
        if(index == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<s.length();i++){
            String sub = s.substring(index,i+1);
            if(isPalindrome(sub)){
                list.add(sub);
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