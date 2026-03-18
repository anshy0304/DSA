class Solution {
    public void helper(String s,int in,List<String> temp,HashSet<String> set,List<String> ans){
        if(in == s.length()){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<temp.size();i++){
                sb.append(temp.get(i));
                if(i != temp.size()-1){
                    sb.append(" ");
                }
            }
            ans.add(sb.toString());
            return;
        }
        StringBuilder w = new StringBuilder();
        for(int i=in;i<s.length();i++){
            int n = w.length();
            w.append(s.charAt(i));
            if(set.contains(w.toString())){
                temp.add(w.toString());
                helper(s,i+1,temp,set,ans);
                temp.remove(temp.size()-1);
            }
        }

    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String word:wordDict){
            set.add(word);
        }
        helper(s,0,temp,set,ans);
        return ans;
    }
}