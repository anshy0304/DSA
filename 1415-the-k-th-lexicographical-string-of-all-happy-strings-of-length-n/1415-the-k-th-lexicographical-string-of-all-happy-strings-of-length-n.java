class Solution {
    public void per(StringBuilder str,List<String> ans,int n,char last){
        if(str.length() == n){
            ans.add(str.toString());
            return;
        }
        int m = str.length();
        if(last != 'a'){
            per(str.append('a'),ans,n,'a');
            str.setLength(m);
        }if(last != 'b') {
            per(str.append('b'),ans,n,'b');
            str.setLength(m);
        }if(last != 'c'){
            per(str.append('c'),ans,n,'c');
            str.setLength(m);
        }
    }
    public String getHappyString(int n, int k) {
        StringBuilder str = new StringBuilder();
        List<String> ans = new ArrayList<>();
        per(str,ans,n,'.');
        Collections.sort(ans);
        if(k > ans.size()) return "";
        return ans.get(k-1);
    }
}